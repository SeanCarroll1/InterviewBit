public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a)
	{
	  if(a.get(0)==0 && a.size()>1)
	  {
	      while(a.get(0)==0)
	      {
	          a.remove(0);
	      }
	  }
	   if(a.get(a.size()-1)<9)
	   {
	       a.set(a.size()-1,a.get(a.size()-1)+1);
	   
	       return a;
	   }else
	   {
	       int i=a.size()-1;
	       while(i>=0)
	       {
	           if( a.get(i)!=9)
	           {
	               break;
	           }
	           a.set(i,0);
	           i--;
	       }
	       
	       if(i==-1)
	       {
	           a.set(0,1);
	           for(int j=1; j<a.size(); j++)
	           {
	               a.set(j,0);
	           }
	           a.add(0);
	       }else
	       {
	           a.set(i,a.get(i)+1);
	       }
	       
	   }
	   
	   
	   return a;
	}
}
