class M19 
{
	public static void main(String[] args) throws Throwable
	{
			test1();
			test2();
			test3();
			System.out.println("done");
	}
	static void test1() 
	{
	}
	static void test2() throws Exception
	{
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