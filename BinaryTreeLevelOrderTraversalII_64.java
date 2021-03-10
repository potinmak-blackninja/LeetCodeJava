package JavaLeetCodes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//107
public class BinaryTreeLevelOrderTraversalII_64 {
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
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (root == null) {
        	return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
        	ArrayList<Integer> list = new ArrayList<>();
        	int size = queue.size();
        	for (int i = 0; i< size; i++) {
        		TreeNode node = queue.poll(); //poll = remove
        		list.add(node.val);
        		if (node.left != null) {
        			queue.offer(node.left);
        		}
        		if (node.right != null) {
        			queue.offer(node.right);
        		}
        	}
        
        	result.add(0,list);//add element to the index
        	
        }
        
        return result;
    }
}
