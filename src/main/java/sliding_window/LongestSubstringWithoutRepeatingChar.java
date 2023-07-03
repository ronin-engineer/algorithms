package sliding_window;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    // https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length == 0 || length == 1) {
            return length;
        }

        Set<Character> characterSet = new HashSet<>();

        int start = 0;
        int end = 0;
        int max = 0;

        while (end < length) {
            while (characterSet.contains(s.charAt(end))) {
                characterSet.remove(s.charAt(start++));
            }

            characterSet.add(s.charAt(end++));
            max = Math.max(max, end - start);
        }

        return max;
    }


    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
