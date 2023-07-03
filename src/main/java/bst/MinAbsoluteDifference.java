package bst;

import tree.TreeNode;


public class MinAbsoluteDifference {
    // https://leetcode.com/problems/minimum-absolute-difference-in-bst/
    public int getMinimumDifference(TreeNode root) {
        int min = 10^5;
        if (root == null) {
            return min;
        }

        int leftMin = getMinimumDifference(root.left);
        int rightMin = getMinimumDifference(root.right);

        if (root.left != null)
            leftMin = Math.min(leftMin, root.val - root.left.val);
        if (root.right != null)
            rightMin = Math.min(rightMin, root.right.val - root.val);

        return Math.min(leftMin, rightMin);
    }

    public static void main(String[] args) {

    }
}
