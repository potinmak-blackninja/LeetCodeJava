package JavaLeetCodes;

import java.util.ArrayList;
import java.util.List;

//412 FizzBuzz
public class FizzBuzz_25 {
	public static void main(String[] args) {
		int n = 15;
		//fizzBuzz(15);
		System.out.println(fizzBuzz(n));
	}
	
	 public static List<String> fizzBuzz(int n) {
		 ArrayList<String> newList = new ArrayList<String>(); 
	        for (int i = 1; i<=n; i++) {
	        	System.out.println(i);
	        	if (i%15 == 0) {
	        		newList.add("FizzBuzz");
	        	}
	        	else if ((i%3 == 0) && (i%5 !=0)) {
	        		newList.add("Fizz");
	        	}
	        	else if ((i%5 == 0) && (i%3 !=0)) {
	        		newList.add("Buzz");
	        	}else {
	        		newList.add(String.valueOf(i));
	        	}
	        }
	        return newList;
	    }
}