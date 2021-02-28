package JavaLeetCodes;

//167. Two Sum II - Input array is sorted
public class TwoSumII_55 {
	public static int[] twoSum(int[] numbers, int target) {
		if (numbers == null || numbers.length == 0)
			return null;
	 
		int i = 0;
		int j = numbers.length - 1;
	 
		while (i < j) {
			int x = numbers[i] + numbers[j];
			if (x < target) {
				i++;
				
			} else if (x > target) {
				j--;
			} else {
				return new int[] { i + 1, j + 1 };
			}
		}
	 
		return null;
	}
	public static void main(String[] args) {
		int[] x = {2,7,11,15};
		int[] result = twoSum(x, 9);
		for (int i = 0 ; i< result.length; i++) {
			System.out.print(result[i] + ",");
		}
		
	}
}
