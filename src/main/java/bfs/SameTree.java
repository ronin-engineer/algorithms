package bfs;

import tree.TreeNode;

public class SameTree {
    // https://leetcode.com/problems/same-tree/

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        if ((p != null && q == null) || (p == null && q != null)){
            return false;
        }

        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode left1 = new TreeNode(1);
        TreeNode right1 = new TreeNode(2);
        TreeNode root1 = new TreeNode(5, left1, right1);

        TreeNode left2 = new TreeNode(1);
        TreeNode right2 = new TreeNode(7);
        TreeNode root2 = new TreeNode(5, left2, right2);

        System.out.println(isSameTree(root1, root2));
    }
}
