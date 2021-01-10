package JavaLeetCodes;

public class CountPrimes_28 {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(countPrimes(n));
	}
	
	public static int countPrimes(int n) {
	 boolean notPrime[] = new boolean[n];
	 for (int i = 0; i<notPrime.length;i++) {
	 System.out.println(notPrime[i]);
	 }
	    int count = 0;
	    for (int i = 2; i < n; i++) {
	        if (!notPrime[i]) {
	            count++;
	            for (int j = 2; i * j < n; j++) {
	                notPrime[i * j] = true;
	            }
	        }
	     }
	     return count;
	}
	
	/*exceeded time limit
	public static int countPrimes(int n) {
		int count = 0;
		//if (n<2) {
			//count = 0;
		//}else {
			for (int i =2; i<n; i++) {
				if (isPrime(i)) {
					count++;
				}
			}
		//}
		return count;
		
	}
			
	public static boolean isPrime(int n) {
        for (int i=2; i<n; i++) {
        	if (n%i == 0) {
        			return false;
        		}
        	}
        return true;
		} */
    
}
