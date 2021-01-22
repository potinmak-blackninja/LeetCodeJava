package JavaLeetCodes;

//203. Remove Linked List Elements
public class RemoveLinkedListElements_35 {
	
	public static void main(String[] args) {
		//System.out.println("haha");
		ListNode x = new ListNode(6);
		ListNode y = new ListNode(5,x);
		ListNode z = new ListNode(4,y);
		ListNode w = new ListNode(3,z);
		ListNode b = new ListNode(6,w);
		ListNode v = new ListNode(2,b);
		ListNode t = new ListNode(1,v);
		ListNode curr = t;
		while (curr!= null) {
			System.out.print(curr.val+",");
		}
		
	}
	public ListNode removeElements(ListNode head, int val) {
		//method 1:
		/*
		ListNode sentinel = new ListNode(0);
		    sentinel.next = head;

		    ListNode prev = sentinel, curr = head;
		    while (curr != null) {
		      if (curr.val == val) prev.next = curr.next;
		      else prev = curr;
		      curr = curr.next;
		    }
		    return sentinel.next;
		  }
		  */
		//method 2:
		while (head!= null && head.val == val) {
			head = head.next;
		}
		ListNode current_node = head;
		while(current_node != null && current_node.next !=null) {
			if (current_node.next.val == val) {
				current_node.next = current_node.next.next;
			}else {
				current_node = current_node.next;
			}
		}
		return head;
	}
    }

		class ListNode {
				      int val;
				      ListNode next;
				      ListNode() {}
				      ListNode(int val) { this.val = val; }
				      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
				  }
