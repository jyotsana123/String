
public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ssdfdokiewrokpuieoklomok";
		String findStr = "ok";
		int lastIndex = 0;
		int count = 0;
		    
		while (lastIndex != -1) {
		    lastIndex = str.indexOf(findStr,lastIndex);
		    
		    if( lastIndex != -1)
		    {
		        count++;
		           
		    lastIndex += findStr.length();
		    }
		}

		System.out.println(count);
	}

}
