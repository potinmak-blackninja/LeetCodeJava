package JavaLeetCodes;

import java.util.Arrays;

public class ValidAnagram_45 {
	 public static boolean isAnagram(String s, String t) {
	       char[] ch1 = new char[s.length()];
	       char[] ch2 = new char[s.length()];
	       
	       if (s.length()!=t.length()) {
	    	   return false; 
	       } else {
	    	   for (int i = 0; i<s.length(); i++) {
	    		   ch1[i] = s.charAt(i);
	    		   ch2[i] = t.charAt(i);
	    	   	}
	    	   Arrays.sort(ch1);
	    	   Arrays.sort(ch2);
	    	   
	    	   for (int j = 0; j<t.length(); j++) {
	    		   if (ch1[j] != ch2[j]) {
	    			   return false;
	    		   }
	    		   
	    		   
	    	   }return true;
	       }
	    }
	 public static void main(String[] args) {
		 System.out.println(isAnagram("anagram", "nagaram"));
		 System.out.println(isAnagram("rat", "car"));
	 }
}
