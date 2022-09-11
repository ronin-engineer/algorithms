package array;

public class SmallestLetter {
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/

    public static char nextGreatestLetter(char[] letters, char target) {
        if (letters.length == 1)
            return letters[0];

        int mid = letters.length / 2;

        return target < letters[mid] ?
                findSmallest(letters, target, 0, mid) :
                findSmallest(letters, target, mid + 1, letters.length - 1);
    }

    public static char findSmallest(char[] letters, char target, int lower, int upper) {
        if (lower == upper) {
            return letters[upper] > target ? letters[upper] : letters[0];
        }

        int mid = (lower + upper)/2;

        return target <= letters[mid] ?
                findSmallest(letters, target, lower, mid) :
                findSmallest(letters, target, mid + 1, upper);
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters, target));
    }
}
