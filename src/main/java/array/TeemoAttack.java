package array;

public class TeemoAttack {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int poisonedDuration = 0;

        for (int i = 0; i < timeSeries.length - 1; i ++) {
            if (timeSeries[i] + duration - 1 >= timeSeries[i+1]) {
                poisonedDuration += timeSeries[i+1] - timeSeries[i];
            }
            else {
                poisonedDuration += duration;
            }
        }

        poisonedDuration += duration;
        return poisonedDuration;
    }

    public static void main(String[] args) {
        int[] timeSeries = {1, 2};
        int duration = 2;
        System.out.println("Poisoned Duration: " + findPoisonedDuration(timeSeries, duration));
    }
}
