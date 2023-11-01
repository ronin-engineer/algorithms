package set;

import java.util.HashSet;
import java.util.Set;

public class DistinctValues {
    // https://app.codility.com/c/run/trainingXWZ2UX-V9Y/
    public static int getDistinctValues(int[] A) {
        if (A.length < 2) {
            return A.length;
        }

        Set<Integer> set = new HashSet<>();
        for (int v: A) {
            set.add(v);
        }

        return set.size();
    }

    public static void main(String[] args) {

    }
}
