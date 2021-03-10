package JavaLeetCodes;

import java.util.ArrayList;
import java.util.List;

//459. Repeated Substring Pattern
public class RepeatedSubstringPattern_68 {
	public static void main(String[] args) {
		System.out.println((int)Math.sqrt(10));
		System.out.println(repeatedSubstringPattern("abab")); 
	}
	/*
	 public boolean repeatedSubstringPattern(String s) {
	        int len = s.length();
	        for (int i=len/2 ; i>=1; i--) {
	        	if (len%i == 0) {
	        		int repeats = len/i;
	        		String substring = s.substring(0,i);
	        		StringBuilder sb = new StringBuilder();
	        		for (int j = 0; j<repeats; j++) {
	        			sb.append(substring);
	        		}
	        		if (sb.toString().equals(s)) return true;
	        	}
	        	
	        }
	        
	        return false;
	    } */
	public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        if (n < 2) return false;
        if (n == 2) return s.charAt(0) == s.charAt(1);    
            
        for (int i = (int)Math.sqrt(n); i > 0; i--) { //i>0 == i>=1
            if (n % i == 0) { //
                List<Integer> divisors = new ArrayList<>();
                divisors.add(i);
                if (i != 1) {
                    divisors.add(n / i);    // finds all the divsior lists.
                }///????????????????????????????????????????????????
                for (int l : divisors) {
                	//System.out.println(l);
                    String tmp = s.substring(0, l);
                    String firstHash = tmp; // = tmp.hashCode(); //printing hascode
                    //int currHash = firstHash; //
                    int start = l;
                    while (start != n && tmp.equals(firstHash)) {
                    	//System.out.println(tmp + " "+ firstHash);
                        tmp = s.substring(start, start + l);
                        
                        start += l;    
                    }
                    //System.out.println("xxx " + tmp + " "+ firstHash);
                    if (start == n && tmp.equals(firstHash)) {
                        return true;    
                    }    
                }     
            }    
        }     
        return false;
    }
}
