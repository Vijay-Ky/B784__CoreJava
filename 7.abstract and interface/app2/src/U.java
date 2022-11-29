interface U
{
	void test1();
	void test2(int i);
	boolean test3(boolean b);
}
abstract class V implements U
{
	public void test2(int i)
	{
		System.out.println("from test2");
	}
}
abstract class W extends V
{
	public void test1()
	{
		System.out.println("from test1");
	}
	abstract void test4();
}
class X extends W
{
	public boolean test3(boolean b)
	{
		System.out.println("from test3");
		return b;
	}
	void test4()
	{
		System.out.println("from test4");
	}
	public static void main(String[]args)
	{
		X obj =new X();
		obj.test1();
		obj.test2(20);
		obj.test4();
		System.out.println(obj.test3(true));
	}
}