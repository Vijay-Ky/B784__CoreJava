class B
{
	B() throws InterruptedException
	{
	}
}
class C extends B
{
	C() throws InterruptedException //we can only go for throws not try and catch
	{
		//this(1);
		/*
		try
		{
			this(1);
		}
		catch (InterruptedException ex)
		{
		}
		*/
		
	
		/*try
		{
			super();
		}
		catch (InterruptedException ex)
		{
		}*/
	}
	C(int a) throws InterruptedException
	{
	}
}
class M22
{
}
