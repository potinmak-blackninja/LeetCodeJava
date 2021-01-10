package JavaLeetCodes;


import java.util.ArrayList;
import java.util.Arrays;

//268. Missing Number
public class MissingNumber_29 {
	public static void main(String[] args) {
		int[] nums = {3,0,1};
		System.out.println(missingNumber(nums));
	}
	 public static int missingNumber(int[] nums) {
		 ArrayList<Integer> newlist = new ArrayList<>();
		 Arrays.sort(nums);
		 //for (int i = 0; i<nums.length; i++) {
		//	 System.out.println(nums[i]);
		 //}
		 int i = 0;
		 int j = 0;
		 while(i<nums.length && j<nums.length+1) {
			if (nums[i]!=j) {
				
				return i;
				
			}
			i++;
			j++;
		 }
		 return i;
	   }

}
