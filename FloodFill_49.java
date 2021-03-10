package JavaLeetCodes;
//733. Flood Fill
public class FloodFill_49 {
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor){
		if(image[sr][sc] == newColor) return image;
		fill(image, sr, sc, image[sr][sc], newColor);
		return image;
	}
	
	public static void fill(int[][] image, int sr, int sc, int color, int newColor) {
		if (sr<0 || sc<0 || sr>=image.length|| sc>= image[0].length || image[sr][sc]!= color)
			{
				return;
			}
		image[sr][sc] = newColor;
		fill(image, sr-1, sc, color, newColor);
		fill(image, sr+1, sc, color, newColor);
		fill(image, sr, sc-1, color, newColor);
		fill(image, sr, sc+1, color, newColor);
	}
	public static void main(String[] args) {
		int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
		int sr, sc, newColor;
		int[][] newImage = floodFill(image, 1,1,2);
		
		for (int i = 0; i<newImage.length;i++) {
			System.out.print("[");
			for (int j = 0; j<newImage.length; j++) {
				System.out.print(newImage[i][j]);
			}
			System.out.print("]");
		}
		
	}
	
	
 }
