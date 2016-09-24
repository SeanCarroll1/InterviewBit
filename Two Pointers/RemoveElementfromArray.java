public class Solution {
	public int removeElement(ArrayList<Integer> a, int b)
	{
	   a.removeAll(Collections.singleton(b));
	    
	    return a.size();
	}
}
