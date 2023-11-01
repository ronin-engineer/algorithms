package sorting;

public class NumberOfDiscIntersections {
    // https://app.codility.com/c/run/trainingNPTPWF-V3Q/
    public int solution(int[] A) {
        int result = 0;

        for (int x = 0; x < A.length - 1; x ++) {
            for (int y = x + 1; y < A.length; y++) {
                if (x + A[x] >= y - A[y]) {
                    if (++result > 10000000) {
                        return -1;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
