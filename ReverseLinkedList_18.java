package JavaLeetCodes;

//206. Reverse Linked List

public class ReverseLinkedList_18 {  
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
  public class Solution {
    public ListNode reverseList(ListNode head) {
    	//if (head == null || head.next == null) return head;
        //ListNode p = reverseList(head.next);
        //head.next.next = head;
        //head.next = null;
        //return p;
    	ListNode prev = null;
    	while (head != null) {
    		ListNode next_node = head.next;
    		head.next = prev;
    		prev = head;
    		head = next_node;
    		}
    	return prev;
    	}
        
    }
  
 }



