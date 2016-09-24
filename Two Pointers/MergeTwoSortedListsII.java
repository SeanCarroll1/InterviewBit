import java.util.*;

public class Solution {
	public void merge(ArrayList<Integer> a, ArrayList<Integer> b) 
	{
	    /*
	    methods that you could also call
	    a.addAll(b);
	    Collections.sort(a);
	   */
	   
	    ArrayList<Integer> result = new ArrayList<Integer>();
       
         
        int i = 0;
        int j = 0;
         
        while(i<a.size() && j<b.size())
        {
            if(a.get(i) < b.get(j)){
               
               i++;
            }
            else if(a.get(i) > b.get(j)){
                //if a is bigger add b before it
                 a.add(i,b.get(j));
                 j++;
            }
            else{
                //If they are both equal add to position
                a.add(i,b.get(j));
                j++;
                i++;
            }           
        }
        
        //If we are at the end of a but there are still some numbers in b
        while(j<b.size())
        {
            a.add(b.get(j));
            j++;
        }
      
	}
}
