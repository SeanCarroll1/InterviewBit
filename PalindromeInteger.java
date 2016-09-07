public class PalindromeInteger
 {
	public boolean isPalindrome(int a) {
	    
	    if(a<0)
	    {
	        return false;
	    }
	    
	    String w=Integer.toString(a);
	    
	    int j=0;
	    
	    for(int i=w.length()-1; i>=w.length()/2; i--)
	    {
	        if(w.charAt(i)!=w.charAt(j))
	        {
	            return false;
	        }
	        j++;
	    }

	        return true;
	        
	    
	}
}
