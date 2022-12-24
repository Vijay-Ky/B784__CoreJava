public class M
{
	public static void main(String[] args) 
	{
		try
		{
			int i = 10;
			System.out.println(i);
		}
	    catch(ArithmeticException ex)
		{
			int j = 20;
			System.out.println(j);
		}
	}
}