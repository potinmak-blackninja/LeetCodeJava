package JavaLeetCodes;

//572. Subtree of Another Tree
public class SubtreeofAnotherTree_65 {
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
	
	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (s == null) {
			return false;
		} else if (isSameTree(s,t )) {
			return true;
		}else {
			return isSubtree(s.left, t)|| isSubtree(s.right,t);
		}
		
	}
	
	public boolean isSameTree(TreeNode s, TreeNode t) {
		if (s == null || t == null) {
			return s == null && t== null;
		}else if (s.val == t.val) {
			return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
		}else {
			return false;
		}
	}
}