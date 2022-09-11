package tree;

public class TreeUtil {
    public static void printTree(TreeNode root) {
        System.out.print("[");
        printNode(root);
        System.out.print("]\n");
    }

    public static void printNode(TreeNode node) {
        if (node == null) {
            System.out.print("null,");
            return;
        }

        System.out.print(node.val + ",");
        if (node.left == null && node.right == null)
            return;

        printNode(node.left);
        printNode(node.right);
    }
}
