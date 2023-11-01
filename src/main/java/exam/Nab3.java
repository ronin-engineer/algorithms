package exam;

import array.ArrayUtil;

public class Nab3 {
    public static int[] solution(String R, int[] V) {
        int initBalanceA = 0, initBalanceB = 0;
        int balanceA = 0, balanceB = 0;

        for (int i = 0; i < R.length(); i++) {
            if (R.charAt(i) == 'A') {
                balanceA += V[i];
                balanceB -= V[i];

                if (balanceB < 0) {
                    initBalanceB -= balanceB;
                    balanceB = 0;
                }
            }
            else {
                balanceA -= V[i];
                balanceB += V[i];

                if (balanceA < 0) {
                    initBalanceA -= balanceA;
                    balanceA = 0;
                }
            }
        }

        return new int[]{initBalanceA, initBalanceB};
    }

    public static void main(String[] args) {
//        String r = "BAABA";
//        int[] v = {2, 4, 1, 1, 2};

//        String r = "ABAB";
//        int[] v = {10,5,10,15};

//        String r = "B";
//        int[] v = {100};

        String r = "A";
        int[] v = {24};

        ArrayUtil.printArray(solution(r, v));
    }
}
