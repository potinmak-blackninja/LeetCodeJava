package JavaLeetCodes;

import java.util.HashMap;
import java.util.Stack;

//20. Valid Parentheses

public class ValidParentheses_7 {
	public static void main(String[] args) {
		boolean x  = isValid("()");
		System.out.println(x);
	}
	public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
	        map.put('(', ')');
	    	map.put('[', ']');
	    	map.put('{', '}');
	    	Stack<Character> stack = new Stack<Character>();
	    	
	    	for (int i = 0; i < s.length(); i++) {
	    		char curr = s.charAt(i);
	     
	    		if (map.keySet().contains(curr)) {
	    			//System.out.println(map.keySet()); //keyset return the keys, not values
	    			stack.push(curr);
	    		} else if (map.values().contains(curr)) { //.values => bunch of values
	    			if (!stack.empty() && map.get(stack.peek()) == curr) { // get the values
	    				stack.pop();
	    			} else {
	    				return false;
	    			}
	    		}
	    	}
	     
	    	return stack.empty();
        }
}
