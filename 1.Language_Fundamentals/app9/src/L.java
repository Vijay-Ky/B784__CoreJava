class L
{
	public static void main(String[] args)
	{
		test();
		System.out.println("from main");
	}
	static int test()
	{
		System.out.println("from test");
		return 0;
	}
}