public class Solution {
	// DO NOT MODIFY THE LIST
	public int findMin(final List<Integer> a) 
	{
	    int low=0;
	    int high=a.size()-1;
	    
	    while(low<=high)
	    {
	         if(a.get(low)<=a.get(high))
	        {
	            return a.get(low);
	        }
	        int mid=(low+high)/2;
	        int next=(mid+1)%a.size();
	        int prev=(mid+a.size()-1)%a.size();
	        
	        if(a.get(mid)<=a.get(next)&&a.get(mid)<=a.get(prev))
	        {
	           
	            return a.get(mid);
	        }else if(a.get(mid)<=a.get(high))
	        {
	            high=mid-1;
	        }else if(a.get(mid)>=a.get(low))
	        {
	            low=mid+1;
	        }
	    }
	    return 0;
	}
}
