class Q 
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
			return 2;	
		}
		catch (NullPointerException ex)
		{
			return 3;	
		}
		return 200;
	}
}

