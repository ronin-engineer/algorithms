package exam;

import java.util.Arrays;

public class Nab1 {

    public static int solution(int[] X, int[] Y) {
        Arrays.sort(X);
        int widest = 0;

        for (int i = 0; i < X.length - 1; i++) {
            if (X[i + 1] - X[i] > widest) {
                widest = X[i + 1] - X[i];
            }
        }

        return widest;
    }


    public static void main(String[] args) {
//        int[] x = {1,8,7,3,4,1,8};
//        int[] x = {5,5,5,7,7,7};
        int[] x = {6, 10, 1, 4, 3};
        int[] y = {};

        System.out.println(solution(x, y));
    }
}
