package app1;
public class G
{
	public static void main(String []args)
	{
		String []x = new String[4];
		for(int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("---------------");
		for(String s1 : x)
		{
			System.out.println(s1);
		}
	}
}
