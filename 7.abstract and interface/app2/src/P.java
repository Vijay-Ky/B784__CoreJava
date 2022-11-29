interface P
{
	void test1();
	void test2(int i);
}
class Q implements P
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test2(int i)
	{
		System.out.println("from test2");
	}
	public static void main(String[] args)
	{
		Q q1 = new Q();
		q1.test1();
		q1.test2(10);
		System.out.println("done");
	}
}