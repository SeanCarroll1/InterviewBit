public class Solution {
	// DO NOT MODIFY THE LIST
	public int maximumGap(final List<Integer> a) 
	{
	    if(a.size()<2)
	    {
	        return 0;
	    }
	    
	    Collections.sort(a);
	    
	    int max=0,temp=0;
	    for(int i=0; i<a.size()-1; i++)
	    {
	            temp=Math.abs(a.get(i)-a.get(i+1));
	            if(temp>max)
	            {
	                max=temp;
	            }
	    }
	    return max;
	}
}
