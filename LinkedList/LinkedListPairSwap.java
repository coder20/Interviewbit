package LinkedList;
/*Given a linked list, swap every two adjacent nodes and return its head.

For example, Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
*/
public class LinkedListPairSwap {
	 static ListNode head;
	 
	 class ListNode
	    {
	        int val;
	        ListNode next;
	        ListNode(int d) {val = d; next = null; }
	        public String toString(){
	    		return ""+val;
	    	}
	    }
	    public ListNode pairSwap(ListNode head){
			ListNode temp=head;
			
			while(temp!=null && temp.next!=null){
				int k = temp.val;
				temp.val = temp.next.val;
				temp.next.val = k;
				temp = temp.next.next;
			}
			return head;
			
		}
}