public class Solution {
	public int isPalindrome(String a) 
	{
	   String s = a.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
	   
	   int j=s.length()-1;
	   for(int i=0; i<j; i++)
	    {
	        if(s.charAt(i)!=s.charAt(j))
	        {
	            return 0;
	        }
	        j--;
	    }
	    return 1;
	}
}
