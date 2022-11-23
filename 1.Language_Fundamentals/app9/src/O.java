class O 
{
	public static void main(String[] args) 
	{
		test(10, 20);
		System.out.println(test2() + test3());
	}
	static void test(int i, int j)
	{
		System.out.println("from(test(int,int))");
	}
	static char test2()
	{
		System.out.println("test2()");
		return 'a';
	}
	static char test3()
	{
		System.out.println("test3()");
		return 'a';
	}
}
