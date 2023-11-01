package two_pointers;

public class ContainerWithMostWater {
    // https://leetcode.com/problems/container-with-most-water
    public int maxArea(int[] height) {
        int x = 0;
        int y = height.length - 1;
        int max = 0;

        while (x < y) {
            max = Math.max(max, (y - x) * Math.min(height[x], height[y]));
            if (height[x] > height[y]) {
                y--;
            }
            else {
                x++;
            }
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
