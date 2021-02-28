package JavaLeetCodes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//938. Range Sum of BST
	public class RangeSumBST_56 {
		public static void main(String[] args) {
			TreeNode root = new TreeNode(10);
			TreeNode right = new TreeNode(15);
			TreeNode left = new TreeNode(5);
			TreeNode leftleft = new TreeNode(3);
			TreeNode leftright = new TreeNode(7);
			TreeNode rightright = new TreeNode(18);
			
			root.left = left;
			root.right = right;
			root.left.left = leftleft;
			root.left.right = leftright;
			root.right.right = rightright;
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
			System.out.println(rangeSumBST(root, 7, 15));
		}
		//method 2
		public static int rangeSumBST2(TreeNode root, int L, int R) {
			int sum = 0;
			if (root == null) {
				return sum;
			}
			
			Queue<TreeNode> queue = new LinkedList<>();
			queue.add(root);
			while(!queue.isEmpty()) {
				TreeNode current = queue.remove();
				if (current.val >= L && current.val <= R) {
					sum += current.val;
				}
				if (current.left != null && current.val >L) {
					queue.add(current.left);
				}
				if (current.right != null && current.val <R) {
					queue.add(current.right);
				}
			}
			return sum;
			
		} 
		
		
		
		static int ans;
	    public static int rangeSumBST(TreeNode root, int L, int R) {
	        ans = 0;
	        rangeSumBST(root, L, R);
	        return ans;
	    }
		
		public void rangeSumBST1(TreeNode node, int L, int R) {
	        if (node != null) {
	            if (L <= node.val && node.val <= R)
	                ans += node.val;
	            if (L < node.val)
	            	rangeSumBST(node.left, L, R);
	            if (node.val < R)
	            	rangeSumBST(node.right, L, R);
	        }
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
