package array;

public class PivotIndex {
    // https://leetcode.com/problems/find-pivot-index/
    public static int pivotIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int[] sum = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
        }

        for (int i = 1; i < sum.length; i++) {
            if (sum[i - 1] == sum[nums.length] - sum[i] || (i == sum.length - 1 && sum[i - 1] == 0)) {
                return i - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = {1,7,3,6,5,6};
        int[] nums = {-1,-1,0,1,1,0};
        System.out.println(pivotIndex(nums));
    }
}
