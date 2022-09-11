package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TownJudge {
    // https://leetcode.com/problems/find-the-town-judge/

//    public static int findJudge(int n, int[][] trust) {
//        if (n == 1)
//            return n;
//
//        HashMap<Integer, Integer> trustMap = new HashMap<>();
//        int judge = -1;
//
//        for (int[] t: trust) {
//            if (judge == t[0]) {
//                judge = -1;
//                break;
//            }
//            trustMap.put(t[1], trustMap.get(t[1]) == null ? 1 : trustMap.get(t[1]) + 1);
//            if (trustMap.get(t[1]) == n - 1) {
//                judge = t[1];
//            }
//        }
//
//        return judge;
//    }


    public static int findJudge(int n, int[][] trust) {
        if (n == 1)
            return n;

        HashMap<Integer, Integer> backForwardTrustMap = new HashMap<>();
        HashMap<Integer, Integer> forwardTrustMap = new HashMap<>();

        int judge = -1;

        for (int[] t: trust) {
            backForwardTrustMap.put(t[1], backForwardTrustMap.get(t[1]) == null ? 1 : backForwardTrustMap.get(t[1]) + 1);
            forwardTrustMap.put(t[0], forwardTrustMap.get(t[0]) == null ? 1 : forwardTrustMap.get(t[0]) + 1);

            if (backForwardTrustMap.get(t[1]) == n - 1) {
                judge = t[1];
            }
        }

        if (forwardTrustMap.get(judge) != null) {
            judge = -1;
        }

        return judge;
    }


    public static void main(String[] args) {
        int[][] trust = {{1,2},{3,2},{1,3},{3,4},{3,1},{2,1},{1,4},{4,3},{4,1},{2,4}};
        int n = 3;

        System.out.println(findJudge(n, trust));
    }
}
