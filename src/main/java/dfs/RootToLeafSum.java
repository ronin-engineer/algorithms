package dfs;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafSum {
    // https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/

    public static int sumRootToLeaf(TreeNode root) {
        List<String> binaryStrings = new ArrayList<>();
        insertBinary(binaryStrings, "", root);

        System.out.println("list:" + binaryStrings);
        int sum = 0;
        for (String binaryString: binaryStrings) {
            sum += Integer.parseInt(binaryString, 2);
        }

        return sum;
    }

    public static void insertBinary(List<String> binaryStrings, String prefix, TreeNode node) {
        if (node == null)
            return;

        prefix = prefix + String.valueOf(node.val);

        if (node.left == null && node.right == null) {
            binaryStrings.add(prefix);
            return;
        }


        insertBinary(binaryStrings, prefix, node.left);
        insertBinary(binaryStrings, prefix, node.right);
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(0);
        TreeNode root = new TreeNode(1, left, right);
        System.out.println(sumRootToLeaf(root));
    }
}
