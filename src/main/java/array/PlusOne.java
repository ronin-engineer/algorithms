package array;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        boolean plusOne = true;
        for (int i = digits.length - 1; i > -1; i--) {
            if (plusOne) {
                if (digits[i] + 1 < 10) {
                    digits[i]++;
                    plusOne = false;
                }
                else {
                    digits[i] = 0;
                }
            }
        }
        if (plusOne) {
            int[] output = new int[digits.length +1];
            output[0] = 1;
            for (int i = 1; i < digits.length + 1; i++) {
                output[i] = digits[i-1];
            }

            return output;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9};
        ArrayUtil.printArray(digits);
        int[] output = plusOne(digits);
        ArrayUtil.printArray(output);
    }
}
