
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num = "345";
		String t = "";
		for(int i=num.length()-1;i>=0;i--)
		{
			t = t+num.charAt(i);
		}
		System.out.println(t);
	}

}
