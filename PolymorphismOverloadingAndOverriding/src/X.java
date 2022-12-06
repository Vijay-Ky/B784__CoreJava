class X 
{
	static void test1()
	{
		System.out.println("from test1");
	}
	static int test1(int i)
	{
		System.out.println("from test1(int)");
		return 0;
	}
	static boolean test1(int i, int j)
	{
		System.out.println("from test1(int,int)");
		return false;
	}

	public static void main(String[] args) 
	{
		X x1 = new X();
		x1.test1();
		x1.test1(90);
		x1.test1(90, 100);
		System.out.println("done");
	}
}
