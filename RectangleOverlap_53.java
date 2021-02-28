package JavaLeetCodes;

public class RectangleOverlap_53 {
	
	public static void main(String[] args) {
		int[] rect1 = {0,0,2,2};
		int[] rect2 = {1,1,3,3};
		//isRectangleOverlap(rect1, rect2);
		System.out.println(isRectangleOverlap(rect1, rect2));
	}
	public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // check if either rectangle is actually a line
        if (rec1[0] == rec1[2] || rec1[1] == rec1[3] ||
            rec2[0] == rec2[2] || rec2[1] == rec2[3]) {
            // the line cannot have positive overlap
            return false;
        }

        return !(rec1[2] <= rec2[0] ||   // left  
                 rec1[3] <= rec2[1] ||   // bottom
                 rec1[0] >= rec2[2] ||   // right
                 rec1[1] >= rec2[3]);    // top
    }

}
