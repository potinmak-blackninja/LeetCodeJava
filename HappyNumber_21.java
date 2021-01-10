package JavaLeetCodes;

import java.util.HashSet;
//202 Happy Number
public class HappyNumber_21 {
	public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>(); //never allows duplicate
        while (n != 1){
            int current = n;
            int sum = 0;
            while(current != 0){
                sum += (current %10)*(current%10);
                current /=10;
                }
        
            if (seen.contains(sum)){
                return false;
            	}
            seen.add(sum);
            n = sum;
        	}
        return true;
    	}
	
	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
}
