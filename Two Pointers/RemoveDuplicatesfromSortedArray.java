public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) 
	{
	  
	  int index = 1;

		if (a == null || a.size() == 0)
			return 0;

		for (int i = 1; i < a.size(); i++) {

			if (!a.get(i).equals(a.get(i - 1)))
			{

				a.set(index, a.get(i));
				index++;
			}
		}

		return index;
	}
}