class M4 
{
	public static void main(String[] args) 
	{
		test1();
		System.out.println("done");
	}
	static void test1() 
	{
		try
		{
			test2(); 
		}
		catch (ClassNotFoundException ex)
		{
		}
	}
	static void test2() throws ClassNotFoundException
	{
		Class.forName(""); 
	}
}
//if you dont keep try-catch then we should keep throws for the caller of that method.
