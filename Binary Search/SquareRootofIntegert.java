public class Solution {
	public int sqrt(int a) 
	{
	    if(a<=2 && a>0)
	    {
	        return 1;
	    }
	    
	    if(a==0)
	    {
	        return 0;
	    }
	    
	    //declare as longs as the numbers can get quite large
	    long i=1;
	    long j=a/2;
	    long smaller=0;
	    
	    while(i<=j)
	    {
	        long mid=((j-i)/2)+i;
	        
	        if(mid*mid==a)
	        {
	          
	            return (int)mid;
	        }else if(mid*mid>a)
	        {
	            j=mid-1;
	        }else if(mid*mid<a)
	        {
	            smaller=mid;
	            i=mid+1;
	        }
	    }
	     
	    return (int)smaller;
	}
}