public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) 
    {
        int moves=0;
        int x=X.get(0);
        int y=Y.get(0);
        
        for(int i=0; i<X.size(); i++)
        {
           
             
            int disX = Math.abs(x - X.get(i));
            int disY = Math.abs(y - Y.get(i));
             
            moves+=Math.max(disX, disY);
            x = X.get(i);
            y = Y.get(i);
            
        }
        return moves;
    }
}
