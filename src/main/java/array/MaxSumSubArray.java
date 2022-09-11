package array;

public class MaxSumSubArray {
    // https://www.educative.io/courses/grokking-the-coding-interview/JPKr0kqLGNP
    public static int findMaxSumSubArray(int k, int[] arr) {
        int maxSum = 0;
        int windowSum = 0;

        for (int windowEnd = 0; windowEnd < arr.length - 1; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                if (maxSum < windowSum) {
                    maxSum = windowSum;
                }

                windowSum -= arr[windowEnd - k + 1];
            }
        }

        return maxSum;
    }


    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println(findMaxSumSubArray(3, arr));
    }
}
