class M 
{
	public static void main(String[] args) 
	{

		System.out.println("main begin");
		int i = 10 / 0;
		try
		{
			System.out.println("from try");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch");
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
