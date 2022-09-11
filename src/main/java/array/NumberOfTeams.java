package array;

public class NumberOfTeams {
    // https://leetcode.com/problems/count-number-of-teams/
    public static int numTeams(int[] rating) {
        int result = 0;

        for (int i = 0; i < rating.length - 2; i++) {
            for (int j = i + 1; j < rating.length - 1; j++) {
                for (int k = j + 1; k < rating.length; k++) {
                    if ((rating[i] < rating[j] && rating[j] < rating[k]) ||
                            (rating[i] > rating[j] && rating[j] > rating[k])) {
                        result++;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        int[] rating = {2,5,3,4,1};
        int[] rating = {1,2,3,4};
        System.out.println(numTeams(rating));
    }
}
