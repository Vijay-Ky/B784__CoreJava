class I
{
	static int x;
	static void test()
	{
		System.out.println("from test:" + x);
		x = 10;
	}
	public static void main(String[] args)
	{
		System.out.println("main1:" + x);
		x = 20;
		test();
		System.out.println("main2:" + x);
	}
}
