package Day35;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        BuyAndSellStocks bass = new BuyAndSellStocks();
        System.out.println(bass.maxProfit(arr));
    }
    public int maxProfit(int[] prices) {
        int[] helper = new int[prices.length];
        helper[0] = prices[0];
        int maxProfit = 0;
        int currProfit;
        for (int i = 1; i < prices.length; i++) {
            currProfit = prices[i] - helper[i - 1];
            if (currProfit > maxProfit) {
                maxProfit = currProfit;
            }
            if (prices[i] < helper[i - 1]) {
                helper[i] = prices[i];
            }
            else {
                helper[i] = helper[i - 1];
            }
        }
        return maxProfit;
    }
}
