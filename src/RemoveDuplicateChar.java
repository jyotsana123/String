
import java.util.*;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
		HashSet<Character> hs = new HashSet<>();
		for(char a :s.toCharArray())
		{
			hs.add(a);
		}
		
//		Iterator<Character> it =hs.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		for(char unique :hs)
		{
			System.out.println(unique);
		}
	}

}
