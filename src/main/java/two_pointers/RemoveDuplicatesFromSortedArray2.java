package two_pointers;

public class RemoveDuplicatesFromSortedArray2 {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii
    public static int removeDuplicates(int[] nums) {
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i < 2 || nums[i] > nums[total - 2]) {
                nums[total++] = nums[i];
            }
        }

        return total;
    }

    public static void main(String[] args) {
//        int[] nums = {0,0,1,1,1,1,2,3,3};
        int[] nums = {0,1,1,1,1,2,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
