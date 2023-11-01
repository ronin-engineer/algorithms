package prefixsum;

import array.ArrayUtil;

import java.util.Arrays;

public class GenomicRangeQuery {
    // https://app.codility.com/c/run/trainingMAQHJU-A52/
    public static int[] solution(String S, int[] P, int[] Q) {
        int[][] factorChange = new int[3][S.length()+1];

        for (int i = 0; i < S.length(); i++) {
            int a = 0, c = 0, g = 0;
            char letter = S.charAt(i);
            if (letter == 'A') {
                a = 1;
            }
            else if (letter == 'C') {
                c = 1;
            }
            else if (letter == 'G') {
                g = 1;
            }

            factorChange[0][i+1] = factorChange[0][i] + a;
            factorChange[1][i+1] = factorChange[1][i] + c;
            factorChange[2][i+1] = factorChange[2][i] + g;
        }

        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int from = P[i];
            int to = Q[i] + 1;
            if (factorChange[0][to] - factorChange[0][from] > 0) {
                result[i] = 1;
            }
            else if (factorChange[1][to] - factorChange[1][from] > 0) {
                result[i] = 2;
            }
            else if (factorChange[2][to] - factorChange[2][from] > 0) {
                result[i] = 3;
            }
            else
                result[i] = 4;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "CAGCCTA";
        int[] p = {2, 5, 0};
        int[] q = {4, 5, 6};
        ArrayUtil.printArray(solution(s, p, q));
    }
}
