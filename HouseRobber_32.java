package JavaLeetCodes;

//198. House Robber
public class HouseRobber_32 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(rob(nums));
	}
	public static int rob(int[] nums) {
		
		int presum = 0;
		int currsum = 0;
		for (int x: nums) {
			int temp = currsum;
			currsum =  Math.max(presum + x, currsum);
			System.out.println(currsum);
			presum = temp;
		}
       return currsum;
    }
}
