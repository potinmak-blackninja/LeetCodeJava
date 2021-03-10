package JavaLeetCodes;

//1047	Remove All Adjacent Duplicates In String    
public class RemoveAllAdjacentDuplicatesInString_61 {
	 public static   String removeDuplicates(String S) {
	      char[] stack = new char[S.length()];
	      int i = 0;
	      for (int j = 0; j<S.length(); j++) {
	    	  char current_char = S.charAt(j);
	    	  
	    	  if (i>0 && stack[i-1] == current_char) {
	    		  i--;
	    	  }else {
	    		  stack[i] = current_char;
	    		  i+= 1;
	    	  }//System.out.println(new String(stack,0,i));
	      }
	      
	      return new String(stack, 0, i);
	    }

	public static void main(String[] args) {
		System.out.println(removeDuplicates("abbaca"));
	}

}
