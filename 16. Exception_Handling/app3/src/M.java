class M 
{
	int test()
	{
		try
		{
			//code
			return 10;
		}
		catch (ArithmeticException ex)
		{
			return 20;	
		}
		//unreacheable
		return 30;
	}
}

