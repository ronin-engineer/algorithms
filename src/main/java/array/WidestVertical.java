package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WidestVertical {
    // https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/description/
    public static int maxWidthOfVerticalArea(int[][] points) {
        int[] sortedPoints = new int[points.length];
        int i;
        for (i = 0; i < points.length; i++) {
            sortedPoints[i] = points[i][0];
        }

        Arrays.sort(sortedPoints);
        int maxWidth = 0;
        for (i = 0; i < sortedPoints.length - 1; i++) {
            if (sortedPoints[i+1] - sortedPoints[i] > maxWidth) {
                maxWidth = sortedPoints[i+1] - sortedPoints[i];
            }
        }

        return maxWidth;
    }

    public static void main(String[] args) {
        int[][] points = {{1,5}, {1,70}, {3,1000}, {55,700}, {999876789,53}, {987853567,12}};
        System.out.println(maxWidthOfVerticalArea(points));
    }
}
