import java.util.Scanner;
public class U
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something");
		String s1 = sc.next();
		int i = test(s1);
		System.out.println(i);
	}
	
	static int test(String s5)
	{ 
		int i = 0;
		try
		{
			i = Integer.parseInt(s5);
			return i;
		}
	    catch(NumberFormatException ex)
		{	
			return 0;
		}
		finally
		{
			return 1000;
		}
	}
}