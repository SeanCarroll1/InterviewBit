public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) 
    {
       ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=1; i<=B; i++)
        {
            list.add(i);
        }
        
        int dec=0;
        for(int j=0; j<A.length(); j++)
        {
            if(A.charAt(j)=='D')
            {
                dec++;
            }
            
            
        }
        int in=dec+1;
   
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        result.add(list.get(in-1));
        in++;
        
        for(int i=0; i<A.length(); i++)
        {
            if(A.charAt(i)=='D')
            {
                result.add(list.get(dec-1));
                dec--;
            }else
            {
                result.add(list.get(in-1));
                in++;
            }
        }
        
        return result;
    }
}
