public class Z
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
			System.out.println(2);
			System.exit(100);
			System.out.println(3);
		}
	    catch(ArithmeticException ex)
		{	
			System.out.println(4);
		}
		finally
		{
			System.out.println(5);
		}
		System.out.println(6);
	}
}