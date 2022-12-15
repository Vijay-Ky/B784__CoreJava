class M4 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		test1();
		System.out.println("done");
	}
	static void test1() throws ClassNotFoundException
	{
		test2(); 
	}
	static void test2() throws ClassNotFoundException
	{
		Class.forName(""); 
	}
}
//if you dont keep try-catch then we should keep throws for the caller of that method.
