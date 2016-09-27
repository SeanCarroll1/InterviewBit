public class Solution {
	public int isValid(String a) 
	{
	   Stack<Character> stack = new Stack<Character>();
	    
	    //loop through string
	    for (int i = 0; i < a.length(); i++) 
	    {
	        
	        char c= a.charAt(i);
	        
	        //if starting the Parentheses add to stack

	        if (c == '(' || c == '{' || c == '[') 
	        {
	            stack.push(c);
	        } else 
	        {
	            //if the stack is empty return 0 as it is not valid
	            if (stack.isEmpty()) 
	            {
	                return 0;
	            }
	            
	            char t = stack.peek();
	            //if the Parentheses are correct pop from the stack
	            if ((t == '(' && c == ')') || (t == '{' && c == '}') || (t == '[' && c == ']'))
	            {
	                stack.pop();
	            }
	            else
	            {
	                return 0;
	            }
	                
	        }
	    }
	    
	    if (stack.isEmpty())
	    {
	        return 1;
	    }
	        
	    
	    return 0;
	   
	}
}