interface H
{
	void test1();
}
interface I
{
	void test2();
}
interface J
{
	void test3();
}
abstract class K implements H, I, J
{
	public void test2()
	{
		System.out.println("from test2");
	}
}
class L extends K
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test3()
	{
		System.out.println("from test3");
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