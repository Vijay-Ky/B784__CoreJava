class M19 
{
	public static void main(String[] args) throws Throwable
	{
		test1();
		System.out.println("done");
	}
	static void test1() throws Throwable
	{
		test2();
	}
	static void test2() throws Throwable
	{
		test3();
	}
	static void test3() 
	{
		try
		{
		}
		catch (Exception ex)
		{
		}
		try
		{
		}
		catch (Throwable ex)
		{
		}
	}
}
/* wheather Throwable and Exception are checked or unchecked
- in this case Exception and Throwable both are acting as a checked
- but with respect to try catch both are acting as a unchecked
	but with respect to throws both are acting as checked
	thats why we call Exception and Throwable as semi-checked*/
	
/*
in case of try catch Exception and Throwable both are acting as unchecked.
but in case of methods(for throws) Exception and Throwable both are acting as checked.
That is why we call Exception and Throwable are semi-checked. */