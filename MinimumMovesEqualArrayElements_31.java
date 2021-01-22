package JavaLeetCodes;

import java.util.Arrays;

//453 Minimum Moves to Equal Array Elements
public class MinimumMovesEqualArrayElements_31 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(minMoves(nums));
	}
	public static int minMoves(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i =0; i<nums.length; i++) {
        	res += nums[i] - nums[0];
        }
        return res;
    }
}
