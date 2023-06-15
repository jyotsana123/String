
public class CapitalChar {

	//Write a Java Program to print the Capital words in a String.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "RahulShettyAcademy";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				System.out.println(s.charAt(i));
			}
		}
	}

}
