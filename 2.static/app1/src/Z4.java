class Z4
{
	static int i = test1();
	static int test1()
	{
		System.out.println("from test1");
		return 10;
	}	
	public static void main(String[]args)
	{
		System.out.println(i);
		System.out.println(test1());
		test1();
	}
}
