package JavaLeetCodes;

import java.util.ArrayList;
import java.util.List;


//234. Palindrome Linked List
public class PalindromeLinkedList_17 {
	public static void main(String[] args) {
		//PalindromeLinkedList_17 x = new PalindromeLinkedList_17();
			Solution obj = new Solution();
			ListNode obj1 = new ListNode();
			
			 obj1.val =1 ;
			 ListNode obj2 = new ListNode();
			 obj2.val =2;
			 obj1.next = obj2;
			 ListNode obj3 = new ListNode();
			 obj3.val =2;
			 
			 ListNode obj4 = new ListNode();
			 obj4.val = 1;
			 obj2.next = obj3;
			 obj3.next = obj4;
			 System.out.println(obj.isPalindrome(obj1));
			 ListNode node = new ListNode();
			 node = obj1;
			 while(node!=null) {
				 System.out.print(node.val+ " ");
				 node = node.next;
			 }
		  }
	  
	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {
	      }
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 
	}
	  
	  public static class Solution {
		  
		    public boolean isPalindrome(ListNode head) {
		        List<Integer> vals = new ArrayList<>();

		        // Convert LinkedList into ArrayList.
		        ListNode currentNode = head;
		        while (currentNode != null) {
		            vals.add(currentNode.val);
		            currentNode = currentNode.next;
		        }

		        // Use two-pointer technique to check for palindrome.
		        int front = 0;
		        int back = vals.size() - 1;
		        while (front < back) {
		            // Note that we must use ! .equals instead of !=
		            // because we are comparing Integer, not int.
		            if (!vals.get(front).equals(vals.get(back))) { // if they are not equal then false
		                return false;
		            }
		            front++;
		            back--;
		        }
		        return true;
		    }
		}
	
}
