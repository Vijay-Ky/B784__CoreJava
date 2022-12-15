public class N
{
	public static void main(String[] args) 
	{
		int i = 0;
		try
		{
			System.out.println(i);
		}
	    catch(ArithmeticException ex)
		{	
			System.out.println(i);
		}
		System.out.println(i);
	}
}