interface H
{
	void test1();
	void test2();
}
class I
{
	public void test2()
	{
		System.out.println("from test2");
	}
}
class J extends I implements H
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String[]args)
	{
		J obj = new J();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
