package exam;

public class Nab {
    //

    public static int solution(int[] D, int X) {
        if (D.length == 1) {
            return 1;
        }

        int result = 1;
        int from = D[0] - X;
        int to = D[0] + X;
        for (int i = 1; i < D.length; i++) {
            if (D[i] >= from && D[i] <= to) {
                from = Math.max(from, D[i] - X);
                to = Math.min(to, D[i] + X);
                continue;
            }

            result++;
            from = D[i] - X;
            to = D[i] + X;
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] d = {5,8,2,7};
//        int x = 3;

//        int[] d = {2,5,9,2,1,4};
//        int x = 4;

//        int[] d = {1, 12, 10, 4, 5, 2};
//        int x = 2;


        int[] d = {5,4,8,2,7};
        int x = 3;

        System.out.println(solution(d, x));
    }
}
