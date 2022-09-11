package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class FindPattern {
    // https://leetcode.com/problems/find-and-replace-pattern/

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> matches = new ArrayList<>();

        for (String word: words) {
            if (match(word, pattern))
                matches.add(word);
        }

        return matches;
    }

    public static boolean match(String word, String pattern) {
        HashMap<Character, Character> patternMap = new HashMap<>();
        HashMap<Character, Character> wordMap = new HashMap<>();

        for (int i = 0; i < word.length(); i ++) {
            Character p = pattern.charAt(i);
            Character w = word.charAt(i);
            Character wChar = patternMap.get(p);
            Character pChar = wordMap.get(w);

            if (wChar == null) {
                if (pChar != null)
                    return false;
                patternMap.put(p, w);
                wordMap.put(w, p);
            }
            else {
                if (!wChar.equals(w) || !pChar.equals(p))
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";

        for (String word: findAndReplacePattern(words, pattern)) {
            System.out.println(word);
        }
    }
}
