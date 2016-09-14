public class Solution {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a) 
	{
	    String[] list = new String[a.size()];
	     
        for(int i=0; i<a.size(); i++){
            list[i]=String.valueOf(a.get(i));
        }
     
        //compare which one is bigger ba or ab
        Arrays.sort(list, new Comparator<String>()
        {
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });
     
        StringBuilder sb = new StringBuilder();
        for(String s: list){
            sb.append(s);
        }
     
        while(sb.charAt(0)=='0'&&sb.length()>1)
            sb.deleteCharAt(0);
     
        return sb.toString();
	}
}