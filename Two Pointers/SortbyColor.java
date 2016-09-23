public class Solution {
	public void sortColors(ArrayList<Integer> a) 
	{
	     ArrayList<Integer> colors=new ArrayList<Integer>();
         int red=0,blue=0,white=0;
           
        for(int i=0; i<a.size(); i++)
        {
                if(a.get(i)==0)
                {
                    red++;
                }else if(a.get(i)==1)
                {
                    blue++;
                }else
                {
                    white++;
                }
        }
        colors.add(red);
        colors.add(blue);
        colors.add(white);
     
	    
	    int i=0; 
	    int j=0;
	    
	   while(j<=2)
	   {
	       if(colors.get(j)!=0)
	       {
	           a.set(i,j);
	           i++;
	           colors.set(j,colors.get(j)-1);
	       }else
	       {
	           j++;
	       }
	   }
	}
}