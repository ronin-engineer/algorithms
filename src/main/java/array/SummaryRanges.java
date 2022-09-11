package array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    // https://leetcode.com/problems/summary-ranges/
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        else if (nums.length == 1) {
            result.add(generate(nums[0], nums[0]));
            return result;
        }


        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i - 1] + 1;

            if (current != nums[i]) {
                result.add(generate(start, nums[i - 1]));
                start = nums[i];
            }

            if (i == nums.length - 1) {
                result.add(generate(start, nums[nums.length - 1]));
            }
        }

        return result;
    }

    public static String generate(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        }

        return start + "->" + end;
    }

    public static void main(String[] args) {
        int[] nums = {-1};
        List<String> result = summaryRanges(nums);
        System.out.println(result);
    }
}
