interface X
{
	void test1();
}
interface Y
{
	void test2();
}
class Z
{
	void test3()
	{
		System.out.println("from test3");
	}
}
class Z1 extends Z implements X, Y
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[]args)
	{
		Z1 obj = new Z1();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}
