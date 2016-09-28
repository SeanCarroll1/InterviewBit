/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode a) 
	{
	    if(a == null || a.next == null)
	    {
	        return a;
	    }
            
        //we create two linked list one starting at the beggining 
        ListNode head = a;    
        ListNode front = a.next;
 
        while(front != null)
        {
            //check if they have the same value
            if(front.val == head.val)
            {
                //if so change value by skipping front.val 
                head.next = front.next;
                front = front.next;
                
            }else
            {
                //increment while loop
                head = front;
                front = front.next; 
            }
        }
 
        return a;
	}
}