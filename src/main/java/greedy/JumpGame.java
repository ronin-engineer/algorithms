package greedy;

import java.util.HashSet;
import java.util.Set;

public class JumpGame {
    // https://leetcode.com/problems/jump-game
    public static boolean canJump(int[] nums) {
        int maxLocation = 0;

        for(int i=0; i<nums.length; i++) {
            if(maxLocation < i) return false; // if previous maxLocation smaller than i, meaning we cannot reach location i, thus return false.
            maxLocation = Math.max((i + nums[i]), maxLocation); // greedy:
        }

        return true;
    }

    public static void main(String[] args) {
//        int[] nums = {2,3,1,1,4};
        int[] nums = {1,2,3};
//        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
