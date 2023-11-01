package sliding_window;

import java.util.Arrays;

public class MinSizeSubarraySum {
    // https://leetcode.com/problems/minimum-size-subarray-sum

    public static int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 1 && nums[0] >= target) {
            return 1;
        }

        int from = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int to = 0; to < nums.length; to++) {
            sum += nums[to];
            while (sum >= target) {
                min = Math.min(min, to - from + 1);
                sum -= nums[from++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static int minSubArrayLen1(int target, int[] nums) {
        if (nums.length == 1 && nums[0] >= target) {
            return 1;
        }

        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[nums.length - i - 1];
            if (sum >= target)
                return i + 1;
        }

        return 0;
    }


    public static void main(String[] args) {
//        int[] nums = {2,3,1,2,4,3};
//        int target = 7;

        int[] nums = {12,28,83,4,25,26,25,2,25,25,25,12};
        int target = 213;

        System.out.println(minSubArrayLen(target, nums));
    }
}
