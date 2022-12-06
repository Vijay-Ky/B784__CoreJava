abstract class J
{
	abstract void test1();
	abstract void test2();
	void test3()
	{
		System.out.println("from test3");
	}
}
abstract class K extends J
{
	void test1()
	{
		System.out.println("from test1");
	}
}
class L extends K
{
	void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[]args)
	{
		L obj = new L();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}