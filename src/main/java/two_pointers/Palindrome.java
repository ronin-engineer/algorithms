package two_pointers;

public class Palindrome {
    // https://leetcode.com/problems/valid-palindrome/description
    public static boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }

        int x = 0;
        int y = s.length() - 1;

        while (x < y) {
            if (!Character.isAlphabetic(s.charAt(x)) && !Character.isDigit(s.charAt(x))) {
                x++;
                continue;
            }

            if (!Character.isAlphabetic(s.charAt(y)) && !Character.isDigit(s.charAt(y))) {
                y--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(x)) != Character.toLowerCase(s.charAt(y))) {
                return false;
            }

            x++;
            y--;
        }

        return true;
    }

    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
//        String s = " ";
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
