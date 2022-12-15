class N 
{
	public static void main(String[] args) 
	{
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
