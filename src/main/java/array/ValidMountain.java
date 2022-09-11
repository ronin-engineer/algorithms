package array;

public class ValidMountain {

    // https://leetcode.com/problems/valid-mountain-array/
    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;

        int peak = 0;
        if (arr[0] < arr[1]) {
            peak = 1;
        }
        else
            return false;

        for (int i = 1; i < arr.length - 2; i++) {
            if (arr[i] > arr[i+1]) {
                break;
            }
            else if (arr[i] == arr[i+1]) {
                return false;
            }
            else {
                peak = i+1;
            }
        }

        for (int i = peak; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i+1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        int[] arr = {2, 1};
//        int[] arr = {3, 5, 5};
        int[] arr = {0, 3, 2, 1};
        System.out.println(validMountainArray(arr));
    }
}
