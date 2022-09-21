package array;

public class RemoveDuplicates {
    // two-pointers
    // https://www.educative.io/courses/grokking-the-coding-interview/mEEA22L5mNA
    public static int remove(int[] nums) {
        int nextNonDuplicate = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[nextNonDuplicate - 1] != nums[i]) {
                nums[nextNonDuplicate] = nums[i];
                nextNonDuplicate++;
            }
        }

        return nextNonDuplicate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 3, 6, 9, 9};
//        int[] nums = {2, 2, 2, 11};
        System.out.println(remove(nums));
    }
}
