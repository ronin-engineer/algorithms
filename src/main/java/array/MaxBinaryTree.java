package array;


public class MaxBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildMaxBT(nums, 0, nums.length - 1);
    }

    public static TreeNode buildMaxBT(int[] nums, int start, int end) {
        if (start > end)
            return null;

        int iMax = searchMax(nums, start, end);
        TreeNode left = buildMaxBT(nums, start, iMax - 1);
        TreeNode right = buildMaxBT(nums, iMax + 1, end);

        TreeNode node = new TreeNode(nums[iMax]);
        node.left = left;
        node.right = right;

        return node;
    }

    public static int searchMax(int[] nums, int start, int end) {
        int max = nums[start];
        int iMax = start;

        for (int i = start + 1; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                iMax = i;
            }
        }

        return iMax;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};

    }
}
