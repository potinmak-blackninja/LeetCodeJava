package JavaLeetCodes;

//1413. Minimum Value to Get Positive Step by Step Sum
public class MinimumValuetoGetPositive_54 {
	public static void main(String[] args) {
		int[] nums = {1,-2,-3};
		System.out.println(minStartValue(nums));
	}
	public static int minStartValue(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums) {
        	System.out.println(sum);
            sum += num;
            min = Math.min(sum, min);//
        }
        return min > 0 ? 1 : Math.abs(min) + 1;
    }
}
