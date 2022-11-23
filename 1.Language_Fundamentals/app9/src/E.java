class E
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		E.test1();
		System.out.println("main end");
	}
	public static void test1()
	{
		System.out.println("from test1");
		System.out.println("from test1");
		System.out.println("from test1");
	}
}
class Z
{
	public static void main(String[] args)
	{
		E.test1();
	}
}