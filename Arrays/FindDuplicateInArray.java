public class Solution 
{
public static void main(String [] args)
{
	 ArrayList<Integer> result = getRow(3); 
}

	public ArrayList<Integer> getRow(int a) 
	{
	    
	   ArrayList<Integer> result = new ArrayList<Integer>();
	 
    	 if (a < 0)
    		return result;
     
    	result.add(1);
    	for (int i = 1; i <= a; i++) {
    		for (int j = result.size() - 2; j >= 0; j--) {
    			result.set(j + 1, result.get(j) + result.get(j + 1));
				System.out.println(j);
    		}
    		result.add(1);
    	}
    	return result;
	}
}