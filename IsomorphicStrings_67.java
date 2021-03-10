package JavaLeetCodes;
//205. Isomorphic Strings
///????????????????????????
public class IsomorphicStrings_67 {
	public static void main(String[] args) {
		String s = "egge";
		String t = "addf";
		isIsomorphic( s,t);
	}
	
	public static boolean isIsomorphic(String s, String t) {
	     int[] map1 = new int[256]; //ascii table
	     int[] map2 = new int[256];
	     
	     if (s.length() != t.length()) return false;
	     
	     for (int i = 0; i < s.length(); i++) {
	            char ss = s.charAt(i);
	           // System.out.println(ss);/////
	            char tt = t.charAt(i);
	           // System.out.println(tt);/////
	            if (map1[ss] == 0) { // at index 97
	                map1[ss] = tt; //e => a
	                //System.out.println(map1[ss]);  //////return 97, number of 'a'   
	            } else {
	                if (map1[ss] != tt) return false; 
	            }
	            if (map2[tt] == 0) {
	                map2[tt] = ss;
	                System.out.println(map2[tt]);
	            } else {
	                if (map2[tt] != ss) return false;
	            }
	        }
	        return true;
	 }
	
}
