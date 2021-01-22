package JavaLeetCodes;

import java.util.ArrayList;


//101. Symmetric Tree
public class SymmetricTree_40 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(2);
		TreeNode leftleft = new TreeNode(3); 
		TreeNode leftright = new TreeNode(4);
		TreeNode rightleft = new TreeNode(4);
		TreeNode rightright  = new TreeNode(3);
		
		root.left= left;
		root.right = right;
		root.left.left = leftleft;
		root.right.right =rightright;
		root.left.right =leftright;
		root.right.left =rightleft;
		
		ArrayList<TreeNode> nodes = new ArrayList<TreeNode>();
		ArrayList<Integer> ints = new ArrayList<Integer>();
		nodes.add(root);
		while(!nodes.isEmpty())
		{
			TreeNode n = nodes.get(0); // nodes[0]
			nodes.remove(0);
			ints.add(n.val);
			if(n.left != null)
				nodes.add(n.left);
			else
			{
				//ints.add(null);
			}
			if(n.right != null)
				nodes.add(n.right); //BFS
			
			
		}
		System.out.println(ints);
		
		
	}
	//method1 
	/*
	public boolean isSymmetric(TreeNode root) {
		  return isMirror(root, root);
    }
	
	public boolean isMirror(TreeNode t1, TreeNode t2) {
	    if (t1 == null && t2 == null) return true;
	    if (t1 == null || t2 == null) return false;
	    return (t1.val == t2.val)
	        && isMirror(t1.right, t2.left)
	        && isMirror(t1.left, t2.right);
	}
	 */
	//method2
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return isSymmetric(root.left, root.right);
	}
	
	public boolean isSymmetric(TreeNode left, TreeNode right) {
		if (left == null || right == null) {
			return right == left;
		}
		if (left.val != right.val ) {
			return false;
		}
		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
			
		}
		 
	}
	class TreeNode {
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

