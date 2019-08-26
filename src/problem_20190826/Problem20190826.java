package problem_20190826;

import java.util.Arrays;
import java.util.List;

public class Problem20190826 {

    private static boolean solutionFound(List<Integer> values, int number) {

        //We check if there is a value that would sum number.
        //17-10. Is there any 7? (contains). Is that 7 value not in the same index as i?
        //We introduce a measure to check, and to not compare it to itself using the lastIndexOf part:
        //0 with 1,2...N
        //1 with 2,3...N
        //This way we will optimize the computational time complexity to O(N).
        for (int i = 0; i < values.size(); i++) {
            if (values.contains(number - values.get(i)) && (values.lastIndexOf(number - values.get(i)) > i)) {
                System.out.println(values.get(i) + "-" + (number - values.get(i)) + "-->" + number);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(10, 15, 3, 7);
        System.out.println(solutionFound(values, 17));
    }
}
