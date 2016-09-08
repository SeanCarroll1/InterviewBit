import java.util.*;
public class PrimeSum{
    public static ArrayList<Integer> primesum(int a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(a < 2)
            return result;
        
        int first = 2;
        int second = a - first; 
        
        while(first <= second){
            second = a - first;
         
            if(isPrime(second) && isPrime(first)){
                result.add(first);
                result.add(second);
                return result;
            }
            first++;
        }
        
        return result;
    }
    
    public static boolean isPrime(int n){

          for(int i=2; i<=Math.sqrt(n); i++)
	    {
	        if(n%i==0)
	        {
	            return false;
	        }
	        
	    }
      
        return true;
    }

}