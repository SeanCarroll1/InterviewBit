public class ExcelColumnTitle
 {
	public String convertToTitle(int a) 
	{
	        int b = 26,s=1;
        
    
  
        StringBuilder strBuilder = new StringBuilder();
        while (a != 0) {
            strBuilder.insert(0, (char) ((a - s) % b + 'A'));
            a = (a - s) / b;
        }
        return strBuilder.toString();
	    
	}
}
