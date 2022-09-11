package array;

public class LongestContinuousIncreasingSubsequence {
    // https://leetcode.com/problems/longest-continuous-increasing-subsequence/

    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int count = 1, maxSeq = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                count++;
                if (count > maxSeq) {
                    maxSeq = count;
                }
            }
            else {
                count = 1;
            }
        }

        return maxSeq;
    }

    public static void main(String[] args) {
//        int[] nums = {1,3,5,4,7};
        int[] nums = {2,2,2,2,2};
        System.out.println(findLengthOfLCIS(nums));
    }
}
