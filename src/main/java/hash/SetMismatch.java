package hash;

import array.ArrayUtil;

public class SetMismatch {
    // https://leetcode.com/problems/set-mismatch/

    public static int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length+1];
        int duplicatedNum = 0;
        int missingNum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(++count[nums[i]] > 1) {
                duplicatedNum = nums[i];
            }
            ArrayUtil.printArray(count);
        }

        for (int i = 1; i < count.length; i++) {
            if (count[i] == 0) {
                missingNum = i;
                break;
            }
        }


        return new int[]{duplicatedNum, missingNum};
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        ArrayUtil.printArray(findErrorNums(nums));
    }
}
