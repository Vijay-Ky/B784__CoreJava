class H
{
	void test()
	{
		System.out.println("from test()");
	}
	public static void main(String[]args)
	{
		H h1 = new H();
		h1.test();
		System.out.println("done");
	}
}