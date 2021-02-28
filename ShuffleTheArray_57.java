package JavaLeetCodes;

//1470. Shuffle The Array
public class ShuffleTheArray_57 {
		public static void main(String[] args) {
			int[] nums = {1,2,3,4,4,3,2,1};
			int n = 4;
			int[] nums1 = shuffle(nums,n);
			for (int x:nums1) {
				System.out.print(x + ",");
			}
		}
	
	    public static int[] shuffle(int[] nums, int n) {
	    	int[] newNums = new int[2*n];
	        int i = 0;
	        int j = n;
	        int curr = 0;
	        while(i<n) {
	        	newNums[curr] = nums[i];
	        	curr++;
	        	i++;
	        	newNums[curr] = nums[j];
	        	curr++;
	        	j++;
	        }
	        return newNums;
	    }
	}

