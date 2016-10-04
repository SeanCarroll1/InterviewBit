/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode a) 
    {
         if(a == null || a.next==null)
         {
             return 1;
         }
        
 
        //find list center
        ListNode fast = a;
        ListNode slow = a;
        
        //We can find the midlle by increment fast by two. 
        while(fast.next!=null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

     
        //Here we cane begin to spilt the list , p1 is the head of the second list.
        ListNode p1 = slow.next;
        ListNode p2 = p1.next;
        
        //reverse second part of the list
        while(p1!=null && p2!=null)
        {
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }
     
        slow.next.next = null;
     
        //Check the sublists made.
        ListNode p;
        if(p2==null)
        {
            p=p1;
        }else
        {
            p=p2;
        }
       
       //We compare both lists.
        while(p!=null)
        {
            //If they are not equal, return 0;
            if(p.val != a.val)
            {
                 return 0;
            }
               
     
            p = p.next;
            a = a.next;
     
        }
     
        return 1;
        
    }
}
