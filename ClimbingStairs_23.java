package JavaLeetCodes;
//70. Climbing Stairs
public class ClimbingStairs_23 {
	public static void main(String[] args) {
		System.out.println(climbStairs(44));
	}
	//method1 
	/*
	 public static int climbStairs(int n) {
	        return climb_Stairs(0, n);
	    }
	 
	    public static int climb_Stairs(int i, int n) {
	        if (i > n) {
	            return 0;
	        }
	        if (i == n) {
	            return 1;
	        }
	        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
	    }
	    */
	 //method2
	    public static int climbStairs(int n) { 
	    	int[] dope = new int[n+1];
	    	dope[0] = 1;
	    	dope[1] = 1;
	    	for (int i =2; i<=n; i++) {
	    		dope[i] = dope[i-1]+dope[i-2];
	    	}
	    	return dope[n];
	    }
	}
