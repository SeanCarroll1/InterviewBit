public class ReverseInteger
 {
	public int reverse(int a) {
	    
	    
	    
	    String w=Integer.toString(a);
	    String u="";
	    int start=w.length()-1,end=0;
	    
	    if(a<0)
	    {
	       
	        end=1;
	        u+=w.charAt(0);
	    }
	    
	    for(int i=start; i>=end; i--)
	    {
	        u+=w.charAt(i);
	    }
	    
	 
	    if(Double.parseDouble(u)>Integer.MAX_VALUE|| Double.parseDouble(u)<Integer.MIN_VALUE)
	    {
	        return 0;
	    }else
	    {
	        return Integer.parseInt(u);
	    }
	    
	}
}