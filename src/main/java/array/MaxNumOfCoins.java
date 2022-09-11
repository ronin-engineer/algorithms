package array;

import java.util.Arrays;
import java.util.Collections;

public class MaxNumOfCoins {
    // https://leetcode.com/problems/maximum-number-of-coins-you-can-get/
    public static int maxCoins(int[] piles) {
        if (piles.length == 0)
            return 0;

        Arrays.sort(piles);
        reverse(piles);

        int n = piles.length / 3;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += piles[i*2 + 1];
        }

        return sum;
    }

    public static void reverse(int[] piles) {
        int mid = piles.length / 2;
        int temp = 0;
        for (int i = 0; i < mid; i++) {
            temp = piles[i];
            piles[i] = piles[piles.length - 1 - i];
            piles[piles.length - 1 - i] = temp;
        }
    }


    public static void main(String[] args) {
        int[] piles = {9,8,7,6,5,1,2,3,4};
        System.out.println(maxCoins(piles));

    }
}
