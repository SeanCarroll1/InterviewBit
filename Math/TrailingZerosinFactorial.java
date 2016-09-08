public class TrailingZerosinFactorial
 {
	public int trailingZeroes(int a) {
	    if(a<0)
	    {
	        return -1;
	    }
	    int count=0;
	    
	    for (long i = 5; a / i >= 1; i *= 5) {
		count += a / i;
	}
 
	return count;
	}
}
