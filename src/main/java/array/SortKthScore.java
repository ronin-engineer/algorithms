package array;

import java.util.Arrays;
import java.util.Comparator;

public class SortKthScore {
    // https://leetcode.com/problems/sort-the-students-by-their-kth-score/description/

    public static int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, Comparator.comparingInt(a -> -a[k]));
        return score;
    }

    public static void main(String[] args) {
        int[][] score = {{10,6,9,1}, {7,5,11,2}, {4,8,3,15}};
        int k = 2;

        score = sortTheStudents(score, k);
        System.out.println(score);
    }
}
