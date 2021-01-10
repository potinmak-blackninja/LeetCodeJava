package JavaLeetCodes;

//706. Design HashMap
public class DesignHashMap_15 {
	Integer [][] map;
	int Num_Buckets = 1000;
	int Buckets_size = 1000;
	public DesignHashMap_15() {
		map = new Integer[Num_Buckets][Buckets_size];
	}
	
	public void put(int key, int value) {
		Integer[] bucket = getBucket(key);
		int keyHash = getKeyHash(key);
		bucket[keyHash] = value;
	}
	
	public int get(int key) {
		Integer[] bucket = getBucket(key);
		int keyHash = getKeyHash(key);
		return bucket[keyHash] == null ? -1 : bucket[keyHash];
	}
	

	public void remove(int key) {
		Integer[] bucket = getBucket(key);
		int keyHash = getKeyHash(key);
		bucket[keyHash] = null;
	}
	
	private Integer[] getBucket(int key) {
		int bucketIdx = key / Buckets_size;
		return map[bucketIdx];
		
	}
	
	private Integer getKeyHash(int key) {
		return key% Buckets_size;
	}
	
}
