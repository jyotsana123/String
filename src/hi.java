
public class hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
		char a[] = s.toCharArray();
		int count;
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && a[i]!=' ')
				{
					count++;
					a[j] ='0';
				}
			}
			if(count>1 && a[i]!='0')
			{
				System.out.println(a[i]);
			}
		}
	}

}
