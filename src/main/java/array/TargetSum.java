package array;

public class TargetSum {
    // target sum
    // https://www.educative.io/courses/grokking-the-coding-interview/xog6q15W9GP
    public static int[] search(int[] nums, int targetSum) {
        if (nums.length == 2) {
            return new int[] {0, 1};
        }


        int start = 0;
        int end = nums.length - 1;
        int sum;
        while (end > start) {
            sum = nums[start] + nums[end];
            if (sum == targetSum) {
                return new int[] {start, end};
            }
            else if (sum > targetSum) {
                end--;
            }
            else {
                start++;
            }
        }

        return new int[] {0, 0};
    }


    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 6};
        int[] nums = {2, 5, 9, 11};
        int targetSum = 11;
        ArrayUtil.printArray(search(nums, targetSum));
    }
}
