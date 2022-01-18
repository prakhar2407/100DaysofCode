package Day99;

public class BestTImeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {2,4,1};
        System.out.println(maxProfit(arr));
    }
//    public static int maxProfit(int[] prices) {
////        int[] helper = new int[prices.length];
//        int helper = prices[0];
//        int maxProfit = 0;
//        int currProfit = 0;
//        for (int i = 1; i < prices.length; i++) {
//            currProfit = prices[i] - helper;
//            if (currProfit > maxProfit) {
//                maxProfit = currProfit;
//            }
//            if (prices[i] < helper) {
//                helper = prices[i];
//            }
//        }
//        return maxProfit;
//    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                max = Math.max(prices[i] - min, max);
            }
            else {
                min = prices[i];
            }
        }
        return max;
    }
}
