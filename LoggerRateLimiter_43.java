package JavaLeetCodes;

import java.util.HashMap;

//359. Logger Rate Limiter
class Logger {

	    /** Initialize your data structure here. */
	    private HashMap<String, Integer> logger;

	    /** Initialize your data structure here. */
	    public Logger() {
	        logger = new HashMap<>();
	    }
	    
	    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
	        If this method returns false, the message will not be printed.
	        The timestamp is in seconds granularity. */
	    public boolean shouldPrintMessage(int timestamp, String message) {
	        if (logger.containsKey(message)) {
	            int ts = logger.get(message);
	            if (timestamp - ts < 10) {
	                return false;
	            }
	        }
	        logger.put(message, timestamp);
	        return true;
	    }
	   
	}
public class LoggerRateLimiter_43 {
	 public static void main(String[] args) {
		LoggerRateLimiter_43 obx = new LoggerRateLimiter_43();
		
		Logger x = new Logger();

	    	// logging string "foo" at timestamp 1
	    	System.out.println(x.shouldPrintMessage(1, "foo")); //returns true; 

	    	// logging string "bar" at timestamp 2
	    	System.out.println(x.shouldPrintMessage(2,"bar")); //returns true;
	    }
}
