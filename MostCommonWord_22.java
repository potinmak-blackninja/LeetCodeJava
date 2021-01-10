package JavaLeetCodes;

import java.util.HashMap;
import java.util.HashSet;
//819 Most Common Word
public class MostCommonWord_22 {
	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		System.out.println(mostCommonWord(paragraph, banned));
	}
	 public static String mostCommonWord(String paragraph, String[] banned) {
	        HashSet<String> bannedWords = new HashSet<>();
	        for(String word: banned) {
	        	bannedWords.add(word);
	        }
	        
	        HashMap<String, Integer> counts = new HashMap<>();
	        for (String word: paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")) { ///?????
	        	System.out.println(word);
	        	if(!bannedWords.contains(word)) {
	        		counts.put(word, counts.getOrDefault(word,0) +1);
	        	}
	        }
	        String result = "";
	        for (String key: counts.keySet()) {
	        	if (result.equals("") || counts.get(key) > counts.get(result)) {
	        		result = key;
	        	}
	        }
	        
	        return result;
	        
	    }
	}
