class N 
{
	int test()
	{
		try
		{
			//code
			return 1;
		}
		catch (ArithmeticException ex)
		{
			return 2;	
		}
		catch (NullPointerException ex)
		{
			return 3;	
		}
		System.out.println("done");
	}
}

