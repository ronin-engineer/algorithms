package array;

public class InsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int lower = 0;
        int upper = nums.length - 1;

        while (lower <= upper) {
            int mid = (lower + upper) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                upper = mid - 1;
            }
            else {
                lower = mid + 1;
            }
        }

        return lower;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
//        System.out.println((3+1)/2);
    }
}
