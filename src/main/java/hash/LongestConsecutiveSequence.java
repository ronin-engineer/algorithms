package hash;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    // https://leetcode.com/problems/longest-consecutive-sequence/?envType=study-plan-v2&envId=top-interview-150

    public static int longestConsecutive(int[] nums) {
        int max = 0;
        HashMap<Integer, Integer> counterMap = new HashMap<>();

        for (int num: nums) {
            if (!counterMap.containsKey(num)) {
                int left = counterMap.getOrDefault(num - 1, 0);
                int right = counterMap.getOrDefault(num + 1, 0);
                int counter = left + right + 1;

                if (counter > max) {
                    max = counter;
                }

                counterMap.put(num, counter);
                counterMap.put(num - left, counter);
                counterMap.put(num + right, counter);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
