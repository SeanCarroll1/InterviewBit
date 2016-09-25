public class Solution {
	public String convert(String a, int b) 
	{
	   ArrayList<ArrayList<Character>> list = new ArrayList<ArrayList<Character>>();
	   ArrayList<Character> inner = new ArrayList<Character>();
	   
	   //if rows less then 1 or bigger then string length return string
	   if(b<=1|| b>a.length())
	   {
	       return a;
	   }
	   //Add the first rows of letters
	   int k=0;
	   while(k<b)
	   {
	       inner = new ArrayList<Character>();
	       inner.add(a.charAt(k));
	       list.add(inner);
	       k++;
	   }
	   
	 
	   //loop up and down through the rows to get the zigzag pattern
	   int j=k-1;
	   boolean up=true;
	   for(int i=k; i<a.length(); i++)
	   {
	       if(up)
	       {
	           j--;
	       }else
	       {
	           j++;
	       }
	       
	       if(j==0)
	       {
	           up=false;
	       }else if(j==k-1)
	       {
	           up=true;
	       }

	        list.get(j).add(a.charAt(i));
	       
	   }
	   
	   StringBuilder result = new StringBuilder();
	   //Append each arraylist to the string to give the zigzag string
	   for(int i=0; i<list.size(); i++)
	   {
	        for(int p=0; p<list.get(i).size(); p++)
	        {
	           result.append(list.get(i).get(p)); 
	        }
             
	   }
	 
	   
	   return result.toString();
	}
}
