public class Solution {
	public String reverseWords(String a) 
	{
	    
	   List<String> result = new ArrayList<>();
       String[] words = a.split("\\s+");
        
        for(int i=0; i<words.length; i++)
        {
            if(!words[i].isEmpty())
                result.add(0, words[i]);
        }
       
        return String.join(" ", result);
	}
}
