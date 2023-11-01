package exam;

import java.util.HashSet;
import java.util.Set;

public class OddNumber {
    // https://app.codility.com/c/run/training5BDYDR-XTE/
    public int solution(int[] A) {
        // Implement your solution here
        if (A.length == 1) {
            return A[0];
        }

        Set<Integer> set = new HashSet<>();
        for (int i: A) {
            if (!set.contains(i))
                set.add(i);
            else
                set.remove(i);
        }

        int result = 0;
        for (Integer in: set) {
           result = in;
           break;
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
