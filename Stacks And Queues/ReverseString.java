public class Solution {
	public String reverseString(String a) 
	{
	    Stack <Character>stack=new Stack<>();
	    //push each character to the stack
	    for(int i=0; i<a.length(); i++)
	    {
	        stack.push(a.charAt(i));
	    }
	    
	   StringBuffer result = new StringBuffer();
	    //pop each character to the string
	    while (!stack.isEmpty()) 
	    {
	        result.append(stack.pop());
	    }
	    
	    return result.toString();
	}
}