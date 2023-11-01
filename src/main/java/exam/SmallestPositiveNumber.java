package exam;

import java.util.Arrays;
import java.util.Date;

public class SmallestPositiveNumber {

    public int solution(int[] A) {
        // Implement your solution here
        if (A.length == 0) {
            return 1;
        }

        if (A.length == 1) {
            if (A[0] == 1)
                return 2;
            else
                return 1;
        }
        Arrays.sort(A);
        int i = 0;
        for (i = 0; i < A.length - 1; i++) {
            if (A[i] <= 0) continue;
            if (A[i+1] - A[i] >= 2) {
                break;
            }
        }

        return A[i] > 0 ? A[i] + 1 : 1;
    }

    public static void main(String[] args) {
        System.out.println(new Date());
    }
}
