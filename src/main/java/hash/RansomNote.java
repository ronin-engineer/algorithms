package hash;

import java.util.HashMap;

public class RansomNote {
    // https://leetcode.com/problems/ransom-note/

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            countMap.put(magazine.charAt(i), countMap.get(magazine.charAt(i)) == null ? 1 : countMap.get(magazine.charAt(i)) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (countMap.get(ransomNote.charAt(i)) == null || countMap.get(ransomNote.charAt(i)) <= 0)
                return false;

            countMap.put(ransomNote.charAt(i), countMap.get(ransomNote.charAt(i)) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
