package hash;

public class CenterStar {
    // https://leetcode.com/problems/find-center-of-star-graph/

    public static int findCenter(int[][] edges) {
        int[] count = new int[edges.length+20];
        int n = 0;

        for (int[] edge: edges) {
            if (edge[0] > n)
                n = edge[0];
            if (edge[1] > n)
                n = edge[1];

            count[edge[0]]++;
            count[edge[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if(count[i] == n - 1)
                return i;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[][] edges = {{1,2},{5,1},{1,3},{1,4}};
        System.out.println(findCenter(edges));
    }
}
