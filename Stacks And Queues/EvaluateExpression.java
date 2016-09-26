public class Solution {
	public int evalRPN(ArrayList<String> a) 
	{
	    int[] stack=new int[a.size()];
	    //top keeps track of the top of the stack
	    int top=-1;
	    int sum=0;
	    
	    for(int i=0; i<a.size(); i++)
	    {
	        //if we find an operator we have to do the requested action on the last two numbers
	        if(a.get(i).equals("*"))
	        {
               stack[top-1] = stack[top-1]*stack[top];	
               top--;
	        }else if(a.get(i).equals("/"))
	        {
	             stack[top-1] = stack[top-1]/stack[top];
	              top--;
	        }else if(a.get(i).equals("+"))
	        {
	             stack[top-1] = stack[top-1]+stack[top];
	              top--;
	        }else if(a.get(i).equals("-"))
	        {
	             stack[top-1] = stack[top-1]-stack[top];
	              top--;
	        }else
	        {
	            
    	        top++;
    	        stack[top]=Integer.parseInt(a.get(i));
	        }
	    }
	    
	    return stack[0];
	    
	}
}
