public class Solution {
	public int lengthOfLastWord(final String a)
	{
	    
	    int last=0;
	    boolean check=false;
	    for(int i=a.length()-1; i>=0; i--)
	    {
	       
	        char c = a.charAt(i);
	        
            if((c>='a' && c<='z') || (c>='A' && c<='Z'))
            {
                check = true;
                last++;
                
            }else if(check)
            {
                return last;
            }
	    }
	   
	    return last;
	    
	}
}