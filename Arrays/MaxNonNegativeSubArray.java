public class Solution {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) 
	{
	     ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
	     
	     ArrayList<Integer> list = new ArrayList<Integer>();
	     int place=0;
	     long sum=0,max=0;
	     for(int i=0; i<a.size(); i++)
	     {
	        if(a.get(i)>=0)
	        {
	            list.add(a.get(i));
	            sum+=a.get(i);
	        }else
	        {
	            outer.add(list);
	         
	            if(max<sum)
	            {
	                max=sum;
	                place=outer.size()-1;
	            }
	            
	            sum=0;
	            list = new ArrayList<Integer>();
	        }
	     }
	     if(max<sum)
	            {
	                outer.add(list);
	                 place=outer.size()-1;
	            }
	     
	     
	     return outer.get(place);
	     
	}
}
