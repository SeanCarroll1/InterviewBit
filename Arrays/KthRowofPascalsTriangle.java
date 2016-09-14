import java.util.*;

class KthRowofPascalsTriangle
 
{
public static void main(String [] args)
{
	  ArrayList<Integer> result = getRow(5); 
}

	public static ArrayList<Integer> getRow(int a) 
	{
	    
	   ArrayList<Integer> result = new ArrayList<Integer>();
	 
    	 if (a < 0)
    		return result;
     
    	result.add(1);
		System.out.println(result.size()+ " t");
    	for (int i = 1; i <= a; i++) {
    		for (int j = result.size() - 2; j >= 0; j--) {
			System.out.println(j + " " + (result.size() - 2) + " " +result.size() + " " + i );
    			result.set(j + 1, result.get(j) + result.get(j + 1));
				
    		}
    		result.add(1);
    	}
    	return result;
	}
}