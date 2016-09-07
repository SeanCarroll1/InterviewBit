public class PowerOfTwoIntegers {
    public boolean isPower(int A) {
         
        double x = 2;
        double i;
        
        if(A == 1)
        {
            return true;
        }
        
        for(i = 2; i < 33 && x <= (Math.pow(2, 16)); i++)
        {
            if(Math.pow(x, i) == A)
                return true;
            if(Math.pow(x, i) >=A)
            {
                i = 1;
                x++;
            }
        }
        
        return false;
        }
    }