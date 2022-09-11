package string;

import java.util.HashMap;

public class LongestSubString {

    // sliding_window
    // https://www.educative.io/courses/grokking-the-coding-interview/YQQwQMWLx80
    public static int findLength(String s, int k) {
        int maxLength = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char c = s.charAt(windowEnd);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

            while (freqMap.size() > k) {
                char startChar = s.charAt(windowStart);
                freqMap.put(startChar, freqMap.get(startChar) - 1);
                if (freqMap.get(startChar) == 0) {
                    freqMap.remove(startChar);
                }

                windowStart++;
            }

            if (maxLength < windowEnd - windowStart + 1) {
                maxLength = windowEnd - windowStart + 1;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "cbbebi";
        System.out.println(findLength(s, 3));
    }
}
