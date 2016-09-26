//create class for stack
class Stack{
    public int value;
    public int min;
    public Stack next;
 
    //this will alow us to check the min each time a number is added
    public Stack(int value, int min)
    {
        this.value = value;
        this.min = min;
    }
}

class Solution {
     public Stack list;
 
    public void push(int x) {
       //if null create stack
        if(list==null)
        {
            list=new Stack(x,x);
        }else
        {
            //check if new number is min
            Stack list2=new Stack(x,Math.min(x,list.min));
            //have the rest of the stack equals to list next
            list2.next=list;
            //now put list equal to the whole list
            list=list2;
        }
    }

    public void pop() {
        if(list==null)
        {
            return;
        }
        //list two is equals to everything after the first element
        Stack list2=list.next;
        //list gets rid of first element
        list=list2;
    }

    public int top() 
    {
       if(list==null)
        {
            return -1;
        }
        
        return list.value;
        
    }

    public int getMin() 
    {
         if(list==null)
         {
             return -1;
         }
         
         return list.min;
    }
}
