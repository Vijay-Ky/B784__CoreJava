class Z6 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			System.exit(0);
			System.out.println("try  end");
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
