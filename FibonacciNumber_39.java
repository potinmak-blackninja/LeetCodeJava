package JavaLeetCodes;

//509. Fibonacci Number

public class FibonacciNumber_39 {
	   public static int fib(int N) {
	        if (N==0) return 0;
	        if (N==1) return 1;
	        
	        int a = 0; 
	        int b = 1;
	        int sum = a + b;
	        
	        while (N>1) {
	        	sum = a + b;
	        	a = b;
	        	b = sum;
	        	
	        	N--;
	        }
	        return sum;
	    }
	   public static void main(String[] args) {
		   int ff = fib(4) ;
		   System.out.println(ff);
	   }
}
