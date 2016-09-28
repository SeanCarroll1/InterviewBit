/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode removeNthFromEnd(ListNode a, int b) 
	{
	    if(b==0)
	    {
	        return a;
	    }
	    
	    //create two linkedlists one faster then the other 
	    ListNode head=a;
	    ListNode tail=a;
	    
	    //increment untill we hit before b
	    for(int i=0; i<b; i++)
	    {
	        //if next is null b is bigger then size of list so we remove first element
	        if(head.next==null)
	        {
	            a = a.next;
                return a;
	        }
	        
	        head=head.next;
	    }
	    
	     if(head == null)
	     {
            a = a.next;
            return a;
         }
         
        //once head reaches the end then tail will be at the position we need
	    while(head.next!=null)
	    {
	        head=head.next;
	        tail=tail.next;
	    }
	    
	    tail.next=tail.next.next;
	    
	    return a;
	}
	
}
