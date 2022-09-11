package array;

import java.util.HashMap;

public class SingleNumber {
    // https://leetcode.com/problems/single-number-iii/
    public static int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num: nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            if (frequency.get(num) == 2) {
                frequency.remove(num);
            }
        }
        int[] result = new int[frequency.size()];
        int i = 0;
        for (int num: frequency.keySet()) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] result = singleNumber(nums);
        System.out.println(result);
    }
}
