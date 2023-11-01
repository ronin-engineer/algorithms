package hash;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    //https://leetcode.com/problems/contains-duplicate-ii
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0)
            return true;

        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = indexMap.get(nums[i]);
            if (index != null && i - index <= k) {
                return true;
            }

            indexMap.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
