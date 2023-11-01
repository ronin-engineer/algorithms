package bt;

import tree.TreeNode;

public class InvertTree {
    // https://leetcode.com/problems/invert-binary-tree
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        return new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
    }

    public static void main(String[] args) {

    }

}
