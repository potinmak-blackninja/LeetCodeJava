package JavaLeetCodes;

import java.util.HashMap;


public class FirstUniqueCharacterInAString_27 {
	public static void main(String[] args) {
		String s = "loveleetcode";
		String s1 = "leetcode";
		String s2 = "cc";
		String s3 = "z";
		System.out.println(firstUniqChar(s));
		System.out.println(firstUniqChar(s1));
		System.out.println(firstUniqChar(s2));
		System.out.println(firstUniqChar(s3));
	}
	public static int firstUniqChar(String s) {
		 HashMap<Character, Integer> newlist = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
        	
        	newlist.put(s.charAt(i), newlist.getOrDefault(s.charAt(i), 0)+1);
        	
        	}
        System.out.println(newlist.toString());
        
        int index = s.length();
        for (int i =0; i<index; i++) {
        	if (newlist.get(s.charAt(i)) == 1) {
        		return i;
        			
        			}
        
        	}return -1;
		
        }
    }


