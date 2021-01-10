package JavaLeetCodes;

import java.util.Arrays;
import java.util.Collections;

//283. Move Zeroes
public class MoveZeroes_20 {
	
	public static void main(String[] args) {
		int[] x = {0,1,0,3,12};
		moveZeroes(x);
	}
	public static void moveZeroes(int[] nums) {
		/*Method 1 not quite work
		int count = 0;
       for (int i = 1; i<nums.length; i++) {
        	if (nums[i-1] == 0) {
        		int a = nums[i-1];
        		nums[i-1] = nums[i];
        		nums[i] = a;
        		
        	}else {
        		break;
        	}
        	//0 ,0 ,xxx
        	
        }
       for (int i=0; i<nums.length; i++) {
    	   if (nums[i]==0) {
    		   count++;
    	   }
       }
       System.out.println(count);
        Arrays.sort(nums);
        
        for (int i = 0; i< nums.length/2 ; i++) {
        	int temp = nums[i];
        	nums[i] = nums[nums.length - i -1];
        	nums[nums.length -i -1]= temp;
        }
        // xxx 0 0
        int limit = nums.length - count;
        Arrays.sort(nums, 0, limit); 
        System.out.println(Arrays.toString(nums));
       */
			int index = 0;
			for (int i = 0; i<nums.length; i++) {
				if (nums[i] != 0) {
					nums[index++] = nums[i];
				}
			}
			
			for (int i= index; i<nums.length; i++) {
				nums[i] = 0;
			}
			System.out.println(Arrays.toString(nums));
    }

}
