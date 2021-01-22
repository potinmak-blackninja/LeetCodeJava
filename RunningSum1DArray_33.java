package JavaLeetCodes;

//1480. Running Sum of 1d Array
public class RunningSum1DArray_33 {
	public static void main(String[] args) {
		int[] s = {1,2,3,4};
		//runningSum(s);
		int[] nums = runningSum(s);
		for (int i =0; i<nums.length;i++) {
		System.out.println(nums[i]);
		}
	}
	 public static int[] runningSum(int[] nums) {
	        int[] newArray = {};
	        for (int i=1; i<nums.length;i++) {
	        	nums[i] = nums[i-1]+nums[i];
	        }
	        return nums;
	    }
}
