package JavaLeetCodes;

import java.util.ArrayList;

//104; Maximum Depth of Binary Tree    
public class MaximumDepthBinaryTree_48 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode left = new TreeNode(9);
		TreeNode right = new TreeNode(20);
		//TreeNode leftleft = new TreeNode(null); 
		//TreeNode leftright = new TreeNode(null);
		TreeNode rightleft = new TreeNode(15);
		TreeNode rightright  = new TreeNode(7);
		
		root.left= left;
		root.right = right;
		//root.left.left = leftleft;
		root.right.right =rightright;
		//root.left.right =leftright;
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
			if(n.right != null)
				nodes.add(n.right); //BFS
		}
		System.out.println(ints);
		}
	
	public int maxDepth(TreeNode root) {
	    if (root == null) {
	      return 0; //synergize
	    	} else {
	      int left_height = maxDepth(root.left);
	      int right_height = maxDepth(root.right);
	      return Math.max(left_height, right_height) + 1;
	    	}
		}
	}
	
	


