package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReverseLevelOrderTraversal {
    // https://www.educative.io/courses/grokking-the-coding-interview/m2N6GwARL8r
    public static List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> levelQueue = new LinkedList<>();

        levelQueue.offer(root);
        while (!levelQueue.isEmpty()) {
            int levelSize = levelQueue.size();
            List<Integer> values = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = levelQueue.poll();


            }


        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        List<List<Integer>> result = traverse(root);
        System.out.println("Reverse level order traversal: " + result);

    }
}