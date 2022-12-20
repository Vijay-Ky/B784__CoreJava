class A7 
{
	int test(boolean flag)
	{
		if(flag)
		{
			return 20;	
		}
		else
		{
			return 10;		
		}
		//unreacheable
		return 30;
	}
}
