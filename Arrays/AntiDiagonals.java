public class Solution {
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) 
	{
	   ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
	   ArrayList<Integer> inner = new ArrayList<Integer>();   
	   inner.add(a.get(0).get(0));
	   outer.add(inner);
	   
	    for(int i=1; i<a.get(0).size(); i++)
	    {
	         inner = new ArrayList<Integer>();
	         int k=0;
	         
	         for(int j=i; j>=0; j--)
	         {
	             inner.add(a.get(k).get(j));
	             k++;
	         }
	         outer.add(inner);
	    }
	    
	    int k=1;
	    int l=0;
	    for(int i=1; i<a.get(0).size(); i++)
	    {
	        inner = new ArrayList<Integer>();
	       
	         l++;
	         k=l;
	         
	         for(int j=(a.get(0).size()-1); j>=l; j--)
	         {
	             inner.add(a.get(k).get(j));
	             k++;
	         }
	        outer.add(inner);
	    }
	    
	    return outer;
	}
}
