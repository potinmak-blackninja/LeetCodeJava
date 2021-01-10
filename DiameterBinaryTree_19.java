
package JavaLeetCodes;

//543. Diameter of Binary Tree
public class DiameterBinaryTree_19 {
	
	 //Definition for a binary tree node.
	public static void main(String[] args) {
		//Solution obj = new Solution();
		//TreeNode obj1 = new TreeNode();
		//obj1.val = 
	}
	 public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	class Solution {
		private int longestDepth = 0;
		public int diameterOfBinaryTree(TreeNode root) {
			longestDepth(root);
			return longestDepth;
		}
		private int longestDepth(TreeNode node) {
			if (node == null) {
				return 0;
			}
	    	 
	    		int leftHeight = longestDepth(node.left);
	    		int rightHeight = longestDepth(node.right);
	    	    longestDepth = Math.max(longestDepth, rightHeight+leftHeight);
	    	    return Math.max(leftHeight, rightHeight)+1;    
			}
		
	}
}
