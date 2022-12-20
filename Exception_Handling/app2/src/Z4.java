class Z4 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i = 10;
			i = 10 / 0;
		}
		catch (ArithmeticException ex)
		{
			System.out.println(ex);
			ex = null;
			try
			{
				System.out.println(ex.getMessage());
			}
			catch (NullPointerException ex1)
			{
				System.out.println("NFE");
			}
			
		}
		System.out.println("end of main");
	}
}
