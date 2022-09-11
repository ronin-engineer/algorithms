package dfs;

import tree.TreeNode;
import tree.TreeUtil;

import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {
    // https://leetcode.com/problems/increasing-order-search-tree/

    public static TreeNode increasingBST(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        inOrder(root, vals);

        TreeNode pre = null, cur = null;
        for (int i = vals.size() - 1; i >= 0; i--) {
            cur = new TreeNode(vals.get(i));
            cur.right = pre;
            pre = cur;
        }

        return cur;
    }

    public static void inOrder(TreeNode node, List<Integer> vals) {
        if (node == null) {
            return;
        }

        inOrder(node.left, vals);
        vals.add(node.val);
        inOrder(node.right, vals);
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(7);
        TreeNode root = new TreeNode(5, left, right);
        TreeUtil.printTree(root);
        TreeUtil.printTree(increasingBST(root));
    }

}
