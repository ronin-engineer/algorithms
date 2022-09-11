package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ReduceHalf {
    // https://leetcode.com/problems/reduce-array-size-to-the-half/

    public static int minSetSize(int[] arr) {
        // count frequency
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num: arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int[] frequencies = new int[frequencyMap.size()];
        int i = 0;
        for (int frequency: frequencyMap.values()) {
            frequencies[i++] = frequency;
        }
        Arrays.sort(frequencies);

        int setSize = 0;
        int half = arr.length / 2;
        int count = 0;
        for (i = frequencies.length - 1; i >= 0; i--) {
            count += frequencies[i];
            setSize++;
            if (count >= half) {
                break;
            }
        }

        return setSize;
    }

    public static int findSet(HashMap<Integer, Integer> frequencyMap,
                              Set<Integer> minMap,
                              int currentFrequency,
                              int length) {
        int maxFrequency = 0;
        int maxFrequencyNum = 0;
        for (int num: frequencyMap.keySet()) {
            if (maxFrequency < frequencyMap.get(num)) {
                maxFrequency = frequencyMap.get(num);
                maxFrequencyNum = num;
            }
        }

        minMap.add(maxFrequencyNum);
        frequencyMap.remove(maxFrequencyNum);
        currentFrequency += maxFrequency;

        if (currentFrequency >= length / 2)
            return minMap.size();

        return findSet(frequencyMap, minMap, currentFrequency, length);
    }

    public static void main(String[] args) {
//        int[] a = {3,3,3,3,5,5,5,2,2,7};
        int[] a = {7,7,7,7,7,7};
        System.out.println(minSetSize(a));
    }
}
