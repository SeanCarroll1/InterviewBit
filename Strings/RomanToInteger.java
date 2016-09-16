public class Solution {
	public int romanToInt(String a) 
	{
	    int sum=0;
	    String codes[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
	   while(a.length()>0)
	   {
	       for(int j=0; j<codes.length; j++)
	       {
	           
	           if(a.startsWith(codes[j]))
	           {
	               
                    a=a.substring(codes[j].length());
	               sum+=val[j];
	               break;
	           }
	       }
	    }
	    return sum;
	    
	}
}
