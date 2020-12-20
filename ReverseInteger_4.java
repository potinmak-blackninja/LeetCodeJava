package JavaLeetCodes;

public class ReverseInteger_4 {
	
		public static void main(String[] args) {
			int a = reverse(3341);
			System.out.println(a);
			
		}
		
		 public static int reverse(int x) {
	            int rev = 0;
				int digit;
			      //System.out.println("Original: " + x);
			    while(x != 0) {
				    digit = x % 10;
				   
				    x /= 10;
			     
			  
	            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
			       rev = rev * 10 + digit;
			  }return rev;
	        }
	    }

	

