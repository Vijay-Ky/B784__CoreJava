class Z6 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			//emergency exit and finaly will not be executing
			//System.exit(0);
			//Runtime.getRuntime().exit(0);
			//Runtime.getRuntime().halt(1000);
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
