import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaabbc";
		HashMap<Character,Integer> hm = new HashMap<>();
		for(char a :s.toCharArray())
		{
			if(hm.containsKey(a))
			{
				hm.put(a, hm.get(a)+1);
			}
			else
			{
				hm.put(a, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> str :hm.entrySet())
		{
			System.out.print(str.getKey()+""+str.getValue());
		}
	}

}
