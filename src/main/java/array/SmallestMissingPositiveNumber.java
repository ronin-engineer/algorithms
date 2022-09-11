package array;

import java.util.Arrays;

public class SmallestMissingPositiveNumber {
    // https://leetcode.com/problems/first-missing-positive/

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);
            else
                i++;
        }

        for (i = 0; i < nums.length; i++)
            if (nums[i] != i + 1)
                return i + 1;
        return nums.length + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

        public static void main(String[] args) {
//        int[] nums = {3, 4, -1, 1};
//        int[] nums = {7,8,9,11,12};
        int[] nums = { -3, -2};
        System.out.println(firstMissingPositive(nums));

    }
}
