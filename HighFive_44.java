package JavaLeetCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//1086. High Five
public class HighFive_44 {
	public static void main(String[] args) {
		int[][] group = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
				int[][] result = highFive(group);
			for (int j =0; j<result.length; j++) {
				for (int i =0 ; i<result.length; i++) {
					System.out.print(result[j][i]+" ");
				
				}
				System.out.println();
			}
	}
	
	public static int[][] highFive(int[][] items) {
		 
	          Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
	        for (int[] item: items){
	        	PriorityQueue<Integer> pq = map.getOrDefault(item[0], new PriorityQueue<>());
	        	pq.offer(item[1]); //array[] [x]
	        	if (pq.size() > 5){
	        		pq.poll();
	        	}
	        	map.put(item[0], pq);//one student's top 5 scores
	        }
	        int[][] res = new int[map.keySet().size()][2]; //
	        int index = 0;
	        for (Integer i: map.keySet()){
	        	PriorityQueue<Integer> pq = map.get(i); //getting values
	        	int count = pq.size();//always <=5
	        	int sum = 0;
	        	while (!pq.isEmpty()){
	        		sum += pq.poll(); //popping
	        	}
	        	res[index++] = new int[]{i, sum / count};
	        }
	        return res;
	    
	    
    }

}
