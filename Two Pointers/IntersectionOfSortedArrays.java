public class Solution {
	// DO NOT MODIFY THE LISTS
	public ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) 
	{
	     ArrayList<Integer> result = new ArrayList<Integer>();
       
         
        int i = 0;
        int j = 0;
         
        while(i<a.size() && j<b.size()){
            if(a.get(i) < b.get(j)){
               i++;
            }
            else if(a.get(i) > b.get(j)){
                j++;
            }
            else{
                result.add(b.get(j));
                j++;
                i++;
            }           
        }
        return result;
	}
}
