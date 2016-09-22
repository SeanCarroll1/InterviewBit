public class Solution {
	public int diffPossible(ArrayList<Integer> a, int b) 
	{
	    for(int i=0; i<a.size(); i++)
	    {
	        for(int j=a.size()-1; j>i; j--)
	        {
	          
	            if(Math.abs(a.get(i)-a.get(j))==b)
	            {
	                return 1;
	            }
	            
	            if(Math.abs(a.get(i)-a.get(j))<0)
	            {
	                break;
	            }
	        }
	    }
	    return 0;
	}
}