package two_pointers;

import java.util.Arrays;

public class MinPairSum {
    // https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/
    public static int minPairSum(int[] nums) {
        if (nums.length == 2) {
            return nums[0] + nums[1];
        }

        int max = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] + nums[nums.length - i - 1] > max) {
                max = nums[i] + nums[nums.length - i - 1];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,2,3};
        System.out.println(minPairSum(nums));
    }
}
