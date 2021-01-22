package JavaLeetCodes;
//226. Invert Binary Tree
public class InvertBinaryTree_37 {
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
	
	public TreeNode invertTree(TreeNode root) {
		 if (root == null) {
		        return null;
		    }
		    TreeNode right = invertTree(root.right);
		    TreeNode left = invertTree(root.left);
		    root.left = right;
		    root.right = left;
		    return root;
    }
	
}
