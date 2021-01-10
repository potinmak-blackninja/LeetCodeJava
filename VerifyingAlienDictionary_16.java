package JavaLeetCodes;

//953. Verifying an Alien Dictionary
public class VerifyingAlienDictionary_16 {

	  public static int[] char_map;
			public static boolean isAlienScorted(String[] words, String order) {
				char_map = new int[26];
				for (int i=0; i<order.length(); i++) {
					char_map[order.charAt(i) - 'a'] = i;
					//System.out.println(char_map[order.charAt(i) - 'a']);
				}
				
				for (int i=1; i<words.length; i++) {
					if (compare(words[i-1], words[i]) > 0) { // it is positive that means word 1 should be after word 2
						
						return false;
					}
				}
				return true;
			}
			public static int compare(String word1, String word2) {
				int i = 0;
				int j = 0;
				int char_compare_val = 0;
	            
				while( i < word1.length() && j <word2.length() && char_compare_val == 0) {
					char_compare_val = char_map[word1.charAt(i)-'a'] - char_map[word2.charAt(j)-'a'];
					i++;
					j++;
				}
				
				if (char_compare_val == 0 ) {
					return word1.length() - word2.length();
				}else {
					return char_compare_val;
				}
			}
			
			public static void main(String[] args) {
				String[] words = {"hello","leetcode"};
				String order = "hlabcdefgijkmnopqrstuvwxyz";
				System.out.println(isAlienScorted(words, order));
				String[] words1 = {"apple","app"};
				String order1 = "abcdefghijklmnopqrstuvwxyz";
				System.out.println(isAlienScorted(words1, order1));
			}

	
}
