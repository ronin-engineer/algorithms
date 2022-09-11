package array;

import java.util.*;

public class Intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int x: nums1) {
            set1.add(x);
        }

        for (int y: nums2) {
            set2.add(y);
        }

        if (set1.size() > set2.size())
            return setIntersection(set1, set2);
        return setIntersection(set2, set1);
    }

    public static int[] setIntersection(Set<Integer> set1, Set<Integer> set2) {
        int[] intersection = new int[set2.size()];
        int length = 0;
        for (int i: set1) {
            if(set2.contains(i)) {
                intersection[length] = i;
                length++;
            }
        }

        return Arrays.copyOf(intersection, length);
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        ArrayUtil.printArray(intersection(nums1, nums2));
    }
}
