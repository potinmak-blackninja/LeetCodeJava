package JavaLeetCodes;

import java.util.HashMap;

//219. Contains Duplicate II
public class ContainsDuplicateII_66 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		int k = 3;
		containsNearbyDuplicate(nums, k);
	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
        for (int i = 0; i< nums.length; i++) {
        	int current = nums[i];
        	//System.out.println(map.containsKey(current)+ " " + map.get(current)); //????????
        	if (map.containsKey(current) && i - map.get(current) <=k){
        		return true;
        	}else {
        		map.put(current, i);
        	}
        }
        
        return false;
    }
}
