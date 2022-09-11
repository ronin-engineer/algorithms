package array;

public class FirstBadVersion {

    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }
    // [1T, 2T, 3T, 4F, 5F]

    public boolean isBadVersion(int n) {
        return true;
    }

    public static void main(String[] args) {

    }
}
