public class Solution {
	public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) 
	{
	     if (a.size() == 0 || a.get(0).size() == 0) {
            return 0;
        }
        
	    int i=0;
	    int j=(a.get(0).size()*a.size())-1;
	    int width=a.get(0).size();
	    int height=a.size();
	    //System.out.println(j);
	    
	    while(i<=j)
	    {
	        int mid=(i+j)/2;
	        
	        int h=mid/width;
	        int w=mid % width;
	         
	        if (a.get(h).get(w) == b) {
                return 1;
            } else if (a.get(h).get(w) < b) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
	        
	      
	    }
	    
	    return 0;
	}
	
}