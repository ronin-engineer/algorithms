package bfs;

import tree.TreeNode;

public class MaxDepth {
    // https://leetcode.com/problems/maximum-depth-of-binary-tree/
    public static int maxDepth(TreeNode root) {
        return bfs(root, 0);
    }

    public static int bfs(TreeNode node, int currentLevel) {
        if (node == null)
            return currentLevel;

        currentLevel = currentLevel + 1;
        int leftLevel = bfs(node.left, currentLevel);
        int rightLevel = bfs(node.right, currentLevel);

        return leftLevel > rightLevel ? leftLevel : rightLevel;
    }

    public static void main(String[] args) {

        TreeNode left3 = new TreeNode(7);
        TreeNode right3 = new TreeNode(7);
        TreeNode left2 = new TreeNode(1);
        TreeNode right2 = new TreeNode(7, left3, right3);
        TreeNode root = new TreeNode(5, left2, right2);
        System.out.println("Max Depth: " + maxDepth(root));
    }
}
