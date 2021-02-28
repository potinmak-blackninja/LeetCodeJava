package JavaLeetCodes;

//168. Excel Sheet Column Title
public class ExcelSheetColumnTitle_52 {
	 public static void main(String[] args) {
		 System.out.println(convertToTitle(332)); 
	 }
	 public static String convertToTitle(int n) {
	      StringBuilder res = new StringBuilder();
	      while (n > 0) {
	    	  n--;
	    	  char toAdd = (char)((n%26+65));
	    	  res.insert(0, toAdd);//always insert on index 0;
	    	  n /= 26;
	    	  System.out.println(n);
	      }
	      return res.toString();
	    }
	 
}
