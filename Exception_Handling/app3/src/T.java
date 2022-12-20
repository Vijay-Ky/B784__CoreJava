class T 
{
	int test()
	{
		try
		{
			//code
			return 0;
		}
		catch (ArithmeticException ex)
		{
			return 1;
		}
		finally 
		{
			
		}
		//unreacheable
		return 200;
	}
}

