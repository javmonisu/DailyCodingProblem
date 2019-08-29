package FunnyProblems;

/**
 * Find if there is any root to leaf path with specified sum in a binary tree.
 */
public class FindValueInBst {

    public static void main(String[] args) {
        Node rootNode = new Node(10);
        rootNode.insert(3);
        rootNode.insert(2);
        rootNode.insert(1);
        rootNode.insert(4);
        rootNode.insert(5);
        rootNode.insert(6);
        rootNode.insert(7);
        rootNode.insert(8);
        rootNode.insert(9);
        System.out.println(rootNode.findIt(0, 52));
    }

    public static class Node {
        Node left;
        Node right;
        int value;

        Node(int value) {
            this.value = value;
        }

        void insert(int value) {
            if (value > this.value) {
                if (right == null) {
                    right = new Node(value);
                } else {
                    right.insert(value);
                }
            } else {
                if (left == null) {
                    left = new Node(value);
                } else {
                    left.insert(value);
                }
            }
        }

        boolean findIt(int currentVal, int val) {

            if (currentVal + value == val) {
                return true;
            } else
                return right != null && right.findIt(currentVal + value, val) || left != null && left.findIt(currentVal + value, val);
        }
    }
}
