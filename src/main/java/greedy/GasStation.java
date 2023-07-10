package greedy;

public class GasStation {
    // https://leetcode.com/problems/gas-station/
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGasGap = 0;
        int gasGap = 0;
        int i;
        int start = 0;

        for (i = 0; i < gas.length; i++) {
            totalGasGap += gas[i] - cost[i];
            gasGap += gas[i] - cost[i];

            if (gasGap < 0) {
                gasGap = 0;
                start = i + 1;
            }
        }

        return totalGasGap < 0 ? -1 : start;
    }

    private static int[] sum(int[] a) {
        int[] result = new int[a.length];
        int i;
        int sum = 0;

        for (i = 0; i < a.length; i++) {
            sum += a[i];
            result[i] = sum;
        }

        return result;
    }


    public static void main(String[] args) {
//        int[] gas = {1,2,3,4,5};
//        int[] cost = {3,4,5,1,2};

        int[] gas = {5,1,2,3,4};
        int[] cost = {4,4,1,5,1};

//        int[] gas = {2,3,4};
//        int[] cost = {3,4,3};

//        int[] gas = {0,0,0,2};
//        int[] cost = {0,0,1,0};

        System.out.println(canCompleteCircuit(gas, cost));
    }
}
