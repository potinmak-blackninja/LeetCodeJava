package JavaLeetCodes;


import java.util.HashMap;
import java.util.Map;

//1 Two Sum
public class TwoNumberSum_6 {
	
	public static void main(String[] args) {
		int[] newList = {2,7,11,15};
		int[] result = twoSum(newList, 9);
		for (int i=0; i< result.length;i++) {
			System.out.print(result[i]+ ",");
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < nums.length; i++) {
	        map.put(nums[i], i); // 2:0, 7:1, 11:2, 15:3
	    }
	    for (int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i]; //9-2 = 7
	        if (map.containsKey(complement) && map.get(complement) != i) {
	            return new int[] { i, map.get(complement) };
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
