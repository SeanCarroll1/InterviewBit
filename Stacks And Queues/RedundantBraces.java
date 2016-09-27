public class Solution {
	public int braces(String a) 
	{
	    //create stack
	    Stack<Character> stack = new Stack<Character>(); 
        
        //for loop to run through the string
       for(int i=0; i<a.length(); i++)
       {
            char c = a.charAt(i); 
            //check for operators as if there are none in between return 1
            if(c == '(' || c == '+' || c == '-' || c == '*' || c == '/')
            { 
                stack.push(c); 
            } 
            else if(c == ')')
            { 
                if(stack.peek() == '(')
                { 
                    return 1; 
                } 
                else
                { 
                    while(!stack.isEmpty() && stack.peek() != '(')
                    { 
                        stack.pop(); 
                    }
                    
                    stack.pop(); 
                } 
            } 

        } 
        return 0; 
	}
}
