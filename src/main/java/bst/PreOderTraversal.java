package bst;

import tree.TreeNode;

public class PreOderTraversal {

    public static void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(2, left, right);

        preOrder(root);
    }
}
