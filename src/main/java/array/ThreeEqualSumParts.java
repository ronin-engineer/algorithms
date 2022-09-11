package array;

public class ThreeEqualSumParts {
    // https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/

    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        int[] sumArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sumArr[i+1] = sum;
        }

        if (sum == 0 || sum % 3 != 0)
            return false;

        int partSum = sum / 3;
        int nextPartSum = partSum;

        for (int i = 1; i < sumArr.length; i++) {
            if (sumArr[i] == nextPartSum) {
                nextPartSum += partSum;
                if (nextPartSum == sum)
                    return true;
            }
        }
        return false;
    }

    public static int findInArray(int[] a, int target, int lo, int hi) {
        if (lo == hi) {
            return a[lo] == target ? lo : 0;
        }

        int mid = (lo + hi) / 2;
        if (a[mid] == target)
            return mid;

        return a[mid] > target ?
                findInArray(a, target, lo, mid - 1) :
                findInArray(a, target, mid + 1, hi);
    }


    public static void main(String[] args) {
        int[] arr = {18,12,-18,18,-19,-1,10,10};
        System.out.println(canThreePartsEqualSum(arr));
    }
}
