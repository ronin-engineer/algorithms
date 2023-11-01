package exam;

import java.util.HashSet;
import java.util.Set;

public class SockLaundering {
    // https://app.codility.com/programmers/trainings/3/socks_laundering/
    public static int maxSocks(int K, int[] C, int[] D) {
        int max = 0;
        Set<Integer> cleanSet = new HashSet<>();

        for (int s: C) {
            if (cleanSet.contains(s)) {
                max++;
                cleanSet.remove(s);
            }
            else {
                cleanSet.add(s);
            }
        }

        Set<Integer> dirtySet = new HashSet<>();
        for (int s: D) {
            if (cleanSet.contains(s) && K > 0) {
                cleanSet.remove(s);
                max++;
                K--;
            } else if (dirtySet.contains(s) && K > 1) {
                dirtySet.remove(s);
                max++;
                K -= 2;
            }
            else if (K > 1) {
                dirtySet.add(s);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int k = 4;
        int[] c = {1, 2, 1, 1};
        int[] d = {1, 4, 3, 2, 4};

        System.out.println(maxSocks(k, c, d));
    }
}
