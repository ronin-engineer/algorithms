package array;

import java.util.Arrays;

public class DeckOfCards {
    // https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
    public static boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 0)
            return false;
        if (deck.length == 1)
            return false;

        Arrays.sort(deck);
        int preDuplication = 1;
        int curDuplication = 1;
        boolean firstCheck = false;

        for (int i = 1; i < deck.length; i++) {
            if (deck[i] == deck[i-1]) {
                curDuplication++;
            }
            else {
                if (!firstCheck) {
                    firstCheck = true;
                    preDuplication = curDuplication;
                }
                if (firstCheck && preDuplication != curDuplication) {
                    return false;
                }

                curDuplication = 1;
            }
        }

        return preDuplication == curDuplication || (!firstCheck);
    }

    public static void main(String[] args) {
//        int[] deck = {1,2,3,4,4,3,2,1};
//        int[] deck = {1,1,1,2,2,2,3,3};
        int[] deck = {1,1};
        System.out.println(hasGroupsSizeX(deck));
    }
}
