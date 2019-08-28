package problem_20190827;

import java.util.Arrays;

public class Problem20190827 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productAllNumbersWithDivision(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(productAllNumbersWithDivision(new int[]{3, 2, 1})));
        System.out.println(Arrays.toString(productAllNumbersArray(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(productAllNumbersArray(new int[]{3, 2, 1})));
    }

    private static int[] productAllNumbersWithDivision(int[] nums) {
        int[] products = new int[nums.length];
        int sum = 1;
        for (int num : nums) {
            sum *= num;
        }
        for (int i = 0; i < products.length; i++) {
            products[i] = sum / nums[i];
        }
        return products;
    }
    private static int[] productAllNumbersArray(int[] nums) {
        int[] products = new int[nums.length];
        if (nums.length < 2) {
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            int sum = 0;
            while (j < nums.length) {
                j++;
                if (i == j - 1) {
                    continue;
                }
                if (sum == 0) {
                    sum = nums[j - 1];
                } else {
                    sum = sum * nums[j - 1];
                }
            }
            products[i] = sum;
        }
        return products;
    }
}
