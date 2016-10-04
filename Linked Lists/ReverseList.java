/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode reverseList(ListNode a) 
	{
	    ListNode current=a;
	    ListNode prev=null;
	  //loop until the end of the list
	    while(current!=null)
	    {
	        //set nextone to the linked node
	        ListNode nextOne=current.next;
	        //we now reverse the link to the previous one
	        current.next=prev;
	        //increment prev and current
	        prev=current;
	        current=nextOne;
	    }
	 return prev;   
	}
}
