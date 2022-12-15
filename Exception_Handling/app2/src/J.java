import java.util.Scanner;
class J 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something");
		String s1 = sc.next();
		try
		{
			System.out.println("try begin");
			int i = Integer.parseInt(s1);
			System.out.println("------");
			int k = i / 0;
			System.out.println("try end");
	
		}
		catch (ArithmeticException ex)
		{
			System.out.println("AE");
			System.out.println("AE");
			System.out.println("AE");
		}
		catch (NumberFormatException ex)
		{
			System.out.println("NFE");
			System.out.println("NFE");
			System.out.println("NFE");
		}
		System.out.println("main end");
	}
}
