package array;

public class KQueries {
    public static void query(int[] a, int[][] queries) {
        int sum = 0;

        for (int[] q: queries) {
            for (int i = q[0]; i <= q[1]; i++){
                sum += a[i];
            }
            System.out.println(sum);
            sum = 0;
        }
    }


    public static void query1(int[] a, int[][] queries) {
        int[] sumSet = new int[a.length + 1];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            sumSet[i+1] = sum;
        }

        for (int[] query: queries) {
            System.out.println(sumSet[query[1] + 1] - sumSet[query[0]]);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 4, 7};
        int[][] queries = {{1, 3}, {2, 4}};
        query1(a, queries);
    }

    // 12 + 16 + 9
}
