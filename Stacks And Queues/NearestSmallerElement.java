public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) 
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
            
        for(int i=0; i<arr.size(); i++)
        {
			//check if stack is empty and  if the top number is larger then we need to get rid of it
          while(!stack.empty()&&stack.peek()>=arr.get(i))
          {
              stack.pop();
              
          }
			//if stack is empty then their are no numbers smaller therefore we add -1
            if(stack.empty())
            {
                list.add(-1);
            }else
            {
                list.add(stack.peek());
            }
            //push onto stack
            stack.push(arr.get(i));
        }
        
        return list;
    }
}
