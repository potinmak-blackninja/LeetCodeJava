
	package JavaLeetCodes;

	import java.util.Arrays;

	//88. Merge Sorted Array
	class MergeSortedArray {
		  public static void merge(int[] nums1, int m, int[] nums2, int n) {
			  while(m > 0 && n > 0){
		            if(nums1[m-1] > nums2[n-1]){
		            	nums1[m+n-1] = nums1[m-1];
		                m--;
		            }else{
		            	nums1[m+n-1] = nums2[n-1];
		                n--;
		            }
		        }
		 
		        while(n > 0){
		        	nums1[m+n-1] = nums2[n-1];
		            n--;
		        }
		        System.out.println(Arrays.toString(nums1));
		    
		  }
		  public static void main(String[] args) {
			  int[] nums1 = {1,2,3,0,0,0};
			  int [] nums2 = {2,5,6};
			  int m = 3, n = 3;
			  merge(nums1, m, nums2,n);
		  }
		}


