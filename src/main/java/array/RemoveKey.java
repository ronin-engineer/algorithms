package array;

public class RemoveKey {
    // two-pointer
    // https://www.educative.io/courses/grokking-the-coding-interview/mEEA22L5mNA
    public static int remove(int[] nums, int key) {
        int nextNonKey = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != key) {
                nums[nextNonKey] = nums[i];
                nextNonKey++;
            }
        }

        return nextNonKey;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 6, 3, 10, 9, 3};
        System.out.println(remove(nums, 3));
    }
}
