import java.util.Scanner;
public class R
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something");
		String s1 = sc.next();
		try
		{
			System.out.println(1);
			int i = Integer.parseInt(s1);
			System.out.println(2);
			int k = i / 0;
			System.out.println(3);
			System.out.println("k: " + k);
		}
	    catch(NumberFormatException ex)
		{	
			System.out.println(4);
			System.out.println(ex);
			System.out.println(5);
		}
		System.out.println(6);
	}
}