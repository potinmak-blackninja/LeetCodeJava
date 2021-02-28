package JavaLeetCodes;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//448. Find All Numbers Disappeared in an Array
public class FindAllNumbersDisappearedArray_60 {
	/*
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
		 //method 1
		 HashMap<Integer, Boolean> hashTable = new HashMap<Integer, Boolean>();
	        
	        // Add each of the numbers to the hash table
	        for (int i = 0; i < nums.length; i++) {
	            hashTable.put(nums[i], true);
	        }
	        
	        // Response array that would contain the missing numbers
	        List<Integer> result = new LinkedList<Integer>();
	        
	        // Iterate over the numbers from 1 to N and add all those
	        // that don't appear in the hash table. 
	        for (int i = 1; i <= nums.length; i++) {
	            if (!hashTable.containsKey(i)) {
	                result.add(i);
	            }
	        }
	        
	        return result;
	    }
	    */
	 //method 2
	public static List<Integer> findDisappearedNumbers(int[] nums) {
	        
	        // Iterate over each of the elements in the original array
	        for (int i = 0; i < nums.length; i++) {
	            
	            // Treat the value as the new index
	            int newIndex = Math.abs(nums[i]) - 1; 
	            System.out.print(newIndex + " ");
	            
	            // Check the magnitude of value at this new index
	            // If the magnitude is positive, make it negative 
	            // thus indicating that the number nums[i] has 
	            // appeared or has been visited.
	            if (nums[newIndex] > 0) { //??????????????????????????
	                nums[newIndex] *= -1;
	            }
	        }
	        
	        // Response array that would contain the missing numbers
	        List<Integer> result = new LinkedList<Integer>();
	        
	        // Iterate over the numbers from 1 to N and add all those
	        // that have positive magnitude in the array
	        for (int i = 1; i <= nums.length; i++) {
	            
	            if (nums[i - 1] > 0) {
	                result.add(i);
	            }
	        }
	        
	        return result;
	    }
	 
	 public static void main(String[] args) {
		 int[] nums = {4,3,2,7,8,2,3,1};
		 System.out.println(findDisappearedNumbers(nums)); 
	 }

}
