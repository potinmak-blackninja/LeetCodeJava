package JavaLeetCodes;


import java.util.HashMap;
import java.util.Map;

public class MajorityElement_41 {
	private static Map<Integer, Integer> countNumber(int[] nums){
	
		Map<Integer, Integer> newlist =  new HashMap<Integer, Integer>();
		
        for (int num: nums) {
        	if (!newlist.containsKey(num)){
        		newlist.put(num, 1);
        		}else {
        	newlist.put(num, newlist.get(num)+1);
        	}
        }
        return newlist;
    }
	
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> counts = countNumber(nums);
		Map.Entry<Integer, Integer> majorityEntry = null;
		 for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {//return set view
			 //System.out.println(majorityEntry.getValue());
	            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
	            	
	                majorityEntry = entry;
	            }
	        }
		 return majorityEntry.getKey();
		
		}
	public static void main(String[] args) {
		int[] k = {3,2,3};
		int[] k1 = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(k));
		System.out.println(majorityElement(k1));
	}
	
	
}
