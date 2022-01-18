package Day98;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int[] hlprArr = new int[cost.length];
        for (int i = cost.length - 1; i > -1; i--) {
            if (i == cost.length - 1) {
                hlprArr[i] = cost[i];
            }
            else if (i == cost.length - 2) {
                hlprArr[i] = Math.min(cost[i], cost[i] + hlprArr[i + 1]);
            }
            else {
                hlprArr[i] = Math.min(cost[i] + hlprArr[i + 1], cost[i] + hlprArr[i + 2]);

            }
        }
        return Math.min(hlprArr[0], hlprArr[1]);
    }
}
