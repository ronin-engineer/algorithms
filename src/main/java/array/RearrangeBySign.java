package array;

public class RearrangeBySign {

    public static int[] rearrangeArray(int[] nums) {
        int[] output = new int[nums.length];
        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int num: nums) {
            if (num > 0) {
                output[positiveIndex] = num;
                positiveIndex += 2;
            }
            else {
                output[negativeIndex] = num;
                negativeIndex += 2;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        ArrayUtil.printArray(rearrangeArray(nums));
    }
}
