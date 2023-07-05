package two_pointers;

public class ReverseWord {
    //https://leetcode.com/problems/reverse-words-in-a-string
    public static String reverseWords(String s) {
        int start, end = s.length() - 1;
        StringBuilder builder = new StringBuilder();

        for (start = s.length() - 1; start >= 0; start--) {
            char c = s.charAt(start);
            if (c == ' ') {
                end = start;
                continue;
            }

            if (start + 1 < s.length() && s.charAt(start + 1) == ' ') {
                end = start;
                continue;
            }

            if ((start > 0 && s.charAt(start - 1) == ' ') || (start == 0 && end >= start)) {
                builder.append(s.substring(start, end + 1)).append(" ");
            }
        }

        builder.deleteCharAt(builder.length() - 1);

        return builder.toString();
    }

    public static void main(String[] args) {
//        String s = "  hello world  ";
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
