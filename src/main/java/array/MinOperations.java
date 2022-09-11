package array;

public class MinOperations {
    // https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/

    public static int[] minOperations(String boxes) {
        int[] left = new int[boxes.length()];

        int numOnes = 0;
        if(boxes.charAt(0) == '1') numOnes = 1;
        for(int i = 1; i < boxes.length(); i++) {
            left[i] = left[i - 1] + numOnes;
            if(boxes.charAt(i) == '1') numOnes++;
        }

        int[] ans = new int[left.length];
        numOnes = 0;
        int prev = 0;
        ans[boxes.length() - 1] = left[boxes.length() - 1];
        if(boxes.charAt(boxes.length() - 1) == '1') numOnes = 1;
        for(int i = boxes.length() - 2; i >= 0; i--) {
            ans[i] = prev + numOnes;
            if(boxes.charAt(i) == '1') numOnes++;
            prev = ans[i];
            ans[i] += left[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        String boxes = "001011";
        System.out.println("Boxes: " + boxes);
        System.out.print("Output: ");
        ArrayUtil.printArray(minOperations(boxes));
    }
}
