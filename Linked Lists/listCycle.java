/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) 
	{
	    //Declare both nodes.
	    ListNode fast = a;
        ListNode slow = a;
 
        //while loop 
        while(fast != null && fast.next != null)
        {
            //Slow increments in one while fast jumps two.
            slow = slow.next;
            fast = fast.next.next;
            
            //Check if they are the same.
            if(slow == fast)
            {
                //Put fast to the start so we can find the node that it connects on.
                fast=a;
                //We want to get the node its connected to so we loop until they match again.
                while(fast!=slow)
                {
                    fast=fast.next;
                    slow=slow.next;
                }
                return fast;
            }
                
        }
        //If no loop found return null.
        return null;
	}
}
