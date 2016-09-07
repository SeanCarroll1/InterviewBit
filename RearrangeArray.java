public class RearrangeArray
 {
	public void arrange(ArrayList<Integer> a)
	{
	    int N = a.size();
        
		for (int i = 0; i < N; i++) 
		{
            int num = a.get(i);
            int B = num;
            int C = a.get(num);
            if (C >= N) {
                C = a.get(num) % N;
            }
            int c = B + C * N;
            a.set(i, c);
        }
		
        for (int i = 0; i < N; i++) {
           a.set(i, a.get(i) / N);
        }
	}
}