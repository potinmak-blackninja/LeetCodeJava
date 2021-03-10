package JavaLeetCodes;

//	122	Best Time to Buy and Sell Stock II    
public class BestTimetoBuySellStockII_46 {
	 public static int maxProfit(int[] prices) {
	        if (prices == null || prices.length == 0) {
	        	return 0;
	        }
	        int profit = 0;
	        for (int i = 0; i< prices.length -1 ;i++) {
	        	if (prices[i+1] > prices[i]) {
	        		profit += prices[i+1] - prices[i];
	        		//System.out.println(profit);
	        	}
	        }
	        
	        return profit;
	    }
	 
	 public static void main(String[] args) {
		 int[] nums = {7,1,5,3,6,4};
		 int[] nums1 = {1,2,3,4,5};
		 int[] nums2 = {1,4,3,2,2,8};
		 //System.out.println(maxProfit(nums));
		 //System.out.println(maxProfit(nums1));
		 System.out.println(maxProfit(nums2));
	 }
	 
}
