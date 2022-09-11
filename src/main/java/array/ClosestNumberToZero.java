package array;

public class ClosestNumberToZero {
    // https://leetcode.com/problems/find-closest-number-to-zero/

    public static int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (abs(nums[i]) < abs(closest)) {
                closest = nums[i];
                continue;
            }

            if (abs(nums[i]) == abs(closest)) {
                closest = closest < nums[i] ? nums[i] : closest;
            }
        }

        return closest;
    }

    public static int abs(int n) {
        return n < 0 ? -n : n;
    }

    public static void main(String[] args) {
//        int[] nums = {-4,-2,1,4,8};
        int[] nums = {2,-1,1};
        System.out.println(findClosestNumber(nums));
    }
}
