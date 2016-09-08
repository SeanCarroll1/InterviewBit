public class ExcelColumnNumber
{
public int titleToNumber(String a) {
   
 
    int result = 0;
    int i = a.length()-1;
    int t = 0;
    while(i >= 0){
        char c = a.charAt(i);
        result = result + (int) Math.pow(26, t) * (c-'A'+1);
        t++;
        i--;
    }
 
    return result;
}
}