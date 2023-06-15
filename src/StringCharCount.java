
import java.util.*;
import java.util.Map.Entry;

public class StringCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "helloharry";
		HashMap<Character, Integer> hm = new HashMap<>();
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
		//System.out.println(hm);
		
		for(Entry<Character, Integer> duplicateChar:hm.entrySet())
		{
			System.out.println(duplicateChar.getKey() +": "+duplicateChar.getValue());
		}
	}

}
