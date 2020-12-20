package JavaLeetCodes;

/*
 * #14. Longest Common Prefix
 * #Write a function to find the longest common prefix string amongst an array of strings.
#If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix_3 {
	public static void main (String[]args) {
		String[] x = {"Python","Pytouch", "Py"};
		String[] x1 = {"dog","racecar","car"};
		String result = longestCommonPrefix(x);
		String result1 = longestCommonPrefix(x1);
		//System.out.println(result);
		System.out.println(result1);
	}
	public static String longestCommonPrefix(String[] word) {
		if (word.length == 0) return "";
		String prefix = word[0];
		for (int i = 1; i< word.length; i++) {
			while (word[i].indexOf(prefix)!= 0) {
				//System.out.println(word[i].indexOf(prefix));
				prefix = prefix.substring(0, prefix.length()-1);
			}
			
		}
		return prefix;
	}

}
