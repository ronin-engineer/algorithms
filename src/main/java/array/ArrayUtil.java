package array;

public class ArrayUtil {
    public static void printArray(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length - 1; i++ ){
            System.out.print(a[i] + ",");
        }
        System.out.println(a[a.length-1] + "]");
    }

    public static void main(String[] args) {
        int[] nums = {1};
        printArray(nums);
    }
}
