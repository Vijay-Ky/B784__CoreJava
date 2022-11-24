class P
{
	static
	{
		System.out.println("P-SIB");
	}
	static void test1()
	{
		System.out.println("from test1");
	}
}
class Q
{
	public static void main(String[]args)
	{
		System.out.println("------");
		P.test1();
		P.test1();
		P.test1();
		System.out.println("------");
	}
	static
	{
		System.out.println("Q-SIB");
	}
}
