import java.util.Scanner;
public class S
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
		}
		catch(ArithmeticException ex)
		{	
			System.out.println(4);
			System.out.println(ex);
			System.out.println(5);
		}	
	    catch(NumberFormatException ex)
		{	
			System.out.println(6);
			System.out.println(ex);
			System.out.println(7);
		}
		System.out.println(8);
	}
}