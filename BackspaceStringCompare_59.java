package JavaLeetCodes;

//844. Backspace String Compare
public class BackspaceStringCompare_59 {
	public static void main (String[] args) {
		String S = "ab#c";
		String T = "ad#c";
		//System.out.println(S.substring(0,2));
		System.out.println(backspaceCompare(S,T));
		
	}
	
	public static boolean backspaceCompare(String S, String T) {
		String newS = "";
	    for (int i = 0; i<S.length(); i++) {
	    	newS += S.substring(i,i+1); // one char //stack, push
	    	
	    	if (S.substring(i,i+1).equals("#") ){
	    		//System.out.println("BOO");
	    		newS = newS.substring(0,Math.max(newS.length()-2,0)); //pop it off
	    	}
	    	System.out.println(newS);
	    }
	    String newT = "";
	    for (int j = 0; j<T.length(); j++) {
	    	newT += T.substring(j,j+1);
	    	if (T.substring(j,j+1).equals("#")) {
	    		newT = newT.substring(0,Math.max(newT.length()-2,0));
	    	}
	    }
	    //System.out.println(newS);
	    //System.out.println(newT);
	    return (newT.equals(newS));
		
	  }
}
