package JavaLeetCodes;



//53. Maximum Subarray
public class MaxSubarray_9 {
	public static int maxSubArray(int[] nums) {
	    int result = nums[0];
	    int sum = nums[0];
	 
	    for(int i=1; i<nums.length; i++){
	        sum = Math.max(nums[i], sum + nums[i]); //
	        result = Math.max(result, sum);
	    }
	 
	    return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		maxSubArray(arr);
		System.out.println(maxSubArray(arr));
	}
}
