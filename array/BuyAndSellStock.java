
public class BuyAndSellStock {

	public static int makeProfit(int prices[]) {
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i = 0; i < prices.length; i++) {
			if(buyPrice < prices[i]) { //profit
				int profit = prices[i] -buyPrice; // today profit
				maxProfit = Math.max(maxProfit, profit);
			}else {
				buyPrice = prices[i];
			}
		}
		
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int prices[] = {5, 1, 0, 3, 0, 4};
		System.out.println(makeProfit(prices));

	}

}
