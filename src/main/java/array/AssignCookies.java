package array;

import java.util.Arrays;

public class AssignCookies {
    public static int solution(int[] A) {
        if (A.length == 1) {
            return A[0] + 1 > 0 ? A[0] + 1 : 1;
        }

        Arrays.sort(A);
        for (int i = 1; i < A.length; i ++) {
            if (A[i] - A[i - 1] >= 2) {
                return A[i-1] + 1 > 0 ? A[i-1] + 1 : 1;
            }
        }

        return A[A.length - 1] + 1 > 0 ? A[A.length - 1] + 1 : 1;
    }

    public static void main(String[] args) {
        int[] g = {1, -2, 6, 4, -1, 2};
        System.out.println(solution(g));
    }
}
