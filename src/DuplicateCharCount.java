
import java.security.KeyStore.Entry;
import java.util.*;

public class DuplicateCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello";
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
		
		for(Map.Entry<Character, Integer> duplicateChar :hm.entrySet())
		{
			if(duplicateChar.getValue()>1)
			{
				System.out.println(duplicateChar.getKey()+": "+duplicateChar.getValue());
			}
		}

	}

}
