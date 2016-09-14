public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    
	    
	    HashSet intList = new HashSet();
	    
	    for(int i=0; i<a.size(); i++)
	    {
	        if(intList.contains(a.get(i)))
	        {
	            return a.get(i);
	        }
	        
	        intList.add(a.get(i));
	    }
	    return -1;
	}
}
