package array;

import java.util.HashMap;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int majority = nums.length / 2;

        HashMap<Integer, Integer> concurrencyMap = new HashMap<>();
        for (int num: nums) {
            int concurrency = concurrencyMap.getOrDefault(num, 0);
            concurrency++;
            if (concurrency > majority) {
                return num;
            }
            concurrencyMap.put(num, concurrency);
        }

        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {6,5,5};
        System.out.println(majorityElement(nums));
    }
}
