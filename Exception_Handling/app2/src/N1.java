class N1
{
	public static void main(String[] args) 
	{
		if (true)
		{
			return;
		}
		System.out.println("main begin");
		try
		{
			System.out.println("try");
			return;
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("main end");
	}
}
