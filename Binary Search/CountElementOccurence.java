public class Solution {
	// DO NOT MODIFY THE LIST
	public int findCount(final List<Integer> a, int b) 
	{
	    int i=0;
	    int j=a.size()-1;
	    int count=0;
	    
	    while(i<=j)
	    {
	        int mid=(j+i)/2;
	        
	        if(a.get(mid)==b)
	        {
	            if(mid>0)
	            {
	                 int k=mid-1;
    	            while(k>=0&&a.get(k)==b)
    	            {
    	                count++;
    	                k--;
    	            }
	            }
	         
	            while(mid<a.size()&& a.get(mid)==b )
	            {
	                count++;
	                mid++;
	            }
	            
	           
	            return count;
	        }
	        else if(a.get(mid)>b)
	        {
	            j=mid-1;
	        }else
	        {
	            i=mid+1;
	        }
	   
	    }
	    return count;
	}
}
