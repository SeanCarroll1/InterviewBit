public class Solution {
	public String intToRoman(int a) 
	{
	    int[] bases = { 1000,900,500,400,100,90, 50,40,10,  9,5, 4,1}; 
	    String [] sym={"M","CM","D","CD","C", "XC","L","XL","X","IX","V","IV","I"};
	  
	     
	     String result="";
	     for(int i=0; i<bases.length; i++)
	     {
	         
	         for(int j=0; a>=bases[i]; j++)
	         {
	             result+=sym[i];
	             a-=bases[i];
	         }
	     }
	     
	     return result;
	}

}