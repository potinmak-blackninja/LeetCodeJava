package JavaLeetCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
 */


public class Single_1 {
	public static int singleNumber(List<Integer> nums) {
	    List<Integer> no_duplicate_list = new ArrayList<>();

	    for (int i : nums) {
	      if (!no_duplicate_list.contains(i)) {
	        no_duplicate_list.add(i);
	      } else {
	        no_duplicate_list.remove(new Integer(i));
	      }
	    }
	    return no_duplicate_list.get(0);
	  }
	
	public static void main(String[] args) {
		List<Integer> newList = new ArrayList<>();
		newList = Arrays.asList(4,1,2,1,2);
		singleNumber(newList);
		System.out.println(singleNumber(newList));

	}

}


