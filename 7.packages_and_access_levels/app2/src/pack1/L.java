package pack1;
class L
{
	private void test1()
	{
		System.out.println("from test1");
	}
	void test2()
	{
		System.out.println("from test2");
	}
}
class M extends L
{
	public static void main(String[]args)
	{
		M m1 = new M();
		m1.test1();
		m1.test2();
		System.out.println("done");
	}
}
