public class Solution {
	// DO NOT MODIFY THE LIST
	public int singleNumber(final List<Integer> a) 
	{
	    int result = a.get(0);
	    
        for(int i = 1; i < a.size(); i++)
        {
            //use bitwise XOR
            result ^= a.get(i);
        }
        
        return result;
	}
	
}
