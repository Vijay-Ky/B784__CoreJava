import java.util.Scanner;
class H 
{
	public static void main(String[] args) 
	{
		System.out.println("enter something");
		String s1 = new Scanner(System.in).next();
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = Integer.parseInt(s1);
			System.out.println("------");
			int k = i / 0;
			System.out.println("try end");
		}
		catch (NumberFormatException ex)
		{
			System.out.println("NFE");
		}
		System.out.println("main end");
	}
}
