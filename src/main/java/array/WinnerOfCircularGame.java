package array;

import java.util.ArrayList;
import java.util.LinkedList;

public class WinnerOfCircularGame {
    // https://leetcode.com/problems/find-the-winner-of-the-circular-game/description/

    public static int findTheWinner(int n, int k) {
        if (n == 1) {
            return 1;
        }

        if (k == 1) {
            return n;
        }

        LinkedList<Integer> players = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            players.add(i + 1);
        }

        int current = 0;
        while (players.size() > 1) {
            int playerSize = players.size();
            int nextSteps = (k - 1) % playerSize;
            current += nextSteps;
            current = current < playerSize ? current : current - playerSize;
            players.remove(current);
        }

        return players.get(0);
    }


    public static int findTheWinner1(int n, int k) {
        if (n == 1) {
            return 1;
        }

        if (k == 1) {
            return n;
        }

        int i;
        LinkedList<Integer> players = new LinkedList<>();
        for (i = 0; i < n; i++) {
            players.add(i + 1);
        }

        for (i = 0; i < n - 1; i++) {
            int playerSize = n - i;
            int nextSteps = (k - 1) % playerSize;
            for (int j = 0; j < nextSteps; j++) {
                players.add(players.poll());
            }

            players.poll();
        }

        return players.poll();
    }



    public static void main(String[] args) {
//        System.out.println(findTheWinner(6, 5));
        System.out.println(findTheWinner1(5, 2));
//        System.out.println(findTheWinner(3, 1));
    }
}
