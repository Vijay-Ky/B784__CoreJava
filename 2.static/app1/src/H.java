class H
{
	static int i;
	static void test()
	{
		System.out.println("from test:" + i);
	}
	public static void main(String[] args)
	{
		System.out.println("main:" + i);
		i = 10;
		test();
	}
}
