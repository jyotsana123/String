

public class StringIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "madam";
		String t = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			t = t+s.charAt(i);
		}
		if(s.equals(t))
		{
			System.out.println(s+" is palindrome");
		}
		else
		{
			System.out.println(s+" is not a palindrome");
		}
	}

}
