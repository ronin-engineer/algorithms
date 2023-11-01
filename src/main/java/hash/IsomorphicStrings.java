package hash;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    // https://leetcode.com/problems/isomorphic-strings
    public static boolean isIsomorphic(String s, String t) {
        int[] sMap = new int[256];
        int[] tMap = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (sMap[sc] != tMap[tc]) {
                return false;
            }

            sMap[sc] = i + 1;
            tMap[tc] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
//        String s = "paper";
//        String t = "title";
        System.out.println(isIsomorphic(s, t));
    }
}
