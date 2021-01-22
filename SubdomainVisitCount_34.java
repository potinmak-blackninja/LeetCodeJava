package JavaLeetCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//811. Subdomain Visit Count
public class SubdomainVisitCount_34 {
	public static void main(String[] args) {
		String[] s = {"9001 discuss.leetcode.com"};
		List<String> s1= subdomainVisits(s);
		System.out.println(s1);
		String[] ss = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		System.out.println(subdomainVisits(ss));
	}
	public static List<String> subdomainVisits(String[] cpdomains) {
       Map<String, Integer> counts = new HashMap<>();
       for (String cp: cpdomains) {
    	   int hits = Integer.parseInt(cp.substring(0, cp.indexOf(" ")));
    	   String curr = cp.substring(cp.indexOf(" ")+1); //get the next word
    	   while (!curr.isEmpty()) {
    		   counts.put(curr, counts.getOrDefault(curr, 0)+ hits);
    		   int idx = curr.indexOf(".");
    		   if (idx != -1) {
    			   curr = curr.substring(idx +1); //keep changing curr
    		   }else {
    			   curr = "";
    		   		}
    		   }
    	   }
    	   List<String> ans = new ArrayList<>();
    	   for (String key: counts.keySet()) {
    		   int count = counts.get(key);
    		   String toAdd = count + " " + key;
    		   ans.add(toAdd);
    	   }
    	   return ans;
    }
}
