package string;



public class LengthOfLastWord {
    // https://leetcode.com/problems/length-of-last-word
    public static int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!Character.isAlphabetic(s.charAt(i))) {
                if (length > 0) {
                    break;
                }
                continue;
            }

            length++;
        }

        return length;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
