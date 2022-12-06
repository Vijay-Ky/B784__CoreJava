class B 
{
	static void test1()
	{
		System.out.println("from test1");
	}
	static void test1(int i)
	{
		System.out.println("from test1(int)");
	}
	static void test1(int i, int j)
	{
		System.out.println("from test1(int,int)");
	}

	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test1();
		b1.test1(90);
		b1.test1(90, 100);
		System.out.println("done");
	}
}
