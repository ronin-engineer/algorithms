package array;

public class SmallestSubarrayGreaterSum {
    // https://www.educative.io/courses/grokking-the-coding-interview/7XMlMEQPnnQ
    public static int findMinSubArray(int[] a, int s) {
        int windowSum = 0;
        int windowSize = 0;
        int minWindowSize = 99999;

        for (int i = 0; i < a.length - 1; i++) {
            windowSum += a[i];
            windowSize++;

            if (windowSum >= s) {
                if (minWindowSize > windowSize) {
                    minWindowSize = windowSize;
                }


            }
        }

        return minWindowSize;
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 5, 2, 3, 2};
        System.out.println(findMinSubArray(a, 7));
    }
}
