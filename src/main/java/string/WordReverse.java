package string;

public class WordReverse {

    public static void reverseString(char[] str, int x, int y) {
        for (int i = 0; i <= (x + y) / 2; i++) {
            swapChar(str, i, y - i);
        }
    }

    public static void reverseSubString(char[] str, int x, int y) {
        for (int i = x; i <= (x + y) / 2; i++) {
            swapChar(str, i, y--);
        }
    }

    public static void swapChar(char[] str, int x, int y) {
        char temp = str[x];
        str[x] = str[y];
        str[y] = temp;
    }

    public static void main(String[] args) {
        char[] str = "the sky is blue".toCharArray();
        System.out.println(str);

        reverseString(str, 0, str.length - 1);
        System.out.println(str);

        int wordStart = 0;
        for (int i = 1; i < str.length; i++) {
            if (str[i] == ' ') {
                reverseSubString(str, wordStart, i - 1);
                wordStart = i + 1;
            }

            if (i == str.length - 1) {
                reverseSubString(str, wordStart, i);
            }
        }

        System.out.println(str);
    }
}
