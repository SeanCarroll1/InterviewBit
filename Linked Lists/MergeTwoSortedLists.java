/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode a, ListNode b)
	{
        //create two listnodes one for the top and another to keep adding values.
		ListNode head = new ListNode(0);
		ListNode body = head;

		while (a != null && b != null) 
		{
		    //if a is less then or equals bs value add to body and increment a.
			if (a.val <= b.val) 
			{
				body.next = a;
				a = a.next;
			} else 
			{
				body.next = b;
				b = b.next;
			}

			body = body.next;
		}
        //check if a is null if not meaning b was the one to reach the end in the while loop so we add a.
		if (a != null)
		{
		    body.next = a;
		}
	    //Same check for b.		
		if (b != null)
		{
		   body.next = b; 
		}

		return head.next;
	}
}
