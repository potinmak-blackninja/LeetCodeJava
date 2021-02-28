package JavaLeetCodes;

import java.util.HashMap;
import java.util.Map;

//1010. Pairs of Songs With Total Durations Divisible by 60
public class PairsSongsWithTotalDurationsDivisible_50 {
		

	 
	public static int numPairsDivisibleBy60(int[] time) {
	         Map<Integer, Integer> map = new HashMap<>();
	    int count = 0;
	    for (int t : time) {
	      if (map.containsKey(((60 - t % 60)) % 60)) {
	    	  
	    	  count += map.get((60 - t % 60) % 60);
	      		}
	      		map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);
	    	}
	    System.out.println(map.values());
	    return count;
		 }
	
	public static void main(String[] args) {
		int[] time = {30,20,150,100,40};
		System.out.println(numPairsDivisibleBy60(time));
		System.out.println(100%60);
	}
}
