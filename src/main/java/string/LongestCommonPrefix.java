package string;

public class LongestCommonPrefix {
    // https://leetcode.com/problems/longest-common-prefix
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder result = new StringBuilder();

        compareChar:
        for (int x = 0; x < strs[0].length(); x++) {
            char c = strs[0].charAt(x);
            for (int y = 1; y < strs.length; y++) {
                if (x >= strs[y].length() || c != strs[y].charAt(x)) {
                    break compareChar;
                }
            }

            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
