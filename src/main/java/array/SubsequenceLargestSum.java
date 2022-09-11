package array;

public class SubsequenceLargestSum {
    // https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/

    public static int[] maxSubsequence(int[] nums, int k) {
//        int[] sum = new int[nums.length + 1];
        int slideSum = 0;
        int maxSum = 0;
        int lastIndex = 0;
        int[] maxArray = new int[k];

        for (int i = 0; i < nums.length; i ++) {
            slideSum += nums[i];

            if (i > k - 1) {
                slideSum -= nums[i-k];
            }

            if (slideSum > maxSum) {
                maxSum = slideSum;
                lastIndex = i;
            }
        }

        int currentIndex = lastIndex - k + 1;
        for (int i = 0; i < k; i++) {
            maxArray[i] = nums[currentIndex];
            currentIndex++;
        }

        return maxArray;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3,3};
        int k = 2;
        ArrayUtil.printArray(maxSubsequence(nums, 2));
    }
}
