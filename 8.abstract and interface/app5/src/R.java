interface R
{
	void test1();
}
interface S
{
	void test2();
}
interface T extends S,R
{
	void test3();
}
interface U
{
	void test4();
}
class V
{ 
	void test5()
	{
		System.out.println("from test5");
	}
}
class W extends V implements T,U
{
	public void test1()
	{
		System.out.println("from test1");
	}
	public void test2()
	{
		System.out.println("from test2");	
	}
	public void test3()
	{
		System.out.println("from test3");
	}
	public void test4()
	{	
		System.out.println("from test4");
	}
	public static void main(String[]args)
	{
		W obj = new W();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		System.out.println("done");
	}
}
