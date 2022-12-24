class K 
{
	static void test1()
	{
		System.out.println("test1 begin");
		test2();
		System.out.println("test1 end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
	static void test2()
	{
		System.out.println("test2 begin");
		int i = 20 / 0;
		System.out.println("test2 end");
	}
}
