class N 
{
	static void test()
	{
		System.out.println("test begin");
		main(null);
		System.out.println("test end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
}
