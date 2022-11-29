abstract class H
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
}
class I extends H
{
	void test1()
	{
		System.out.println("from test1");
	}
	void test2()
	{
		System.out.println("from test2");
	}
	void test3()
	{
		System.out.println("from test3");
	}
	public static void main(String[]args)
	{
		//H h1= new H();
		I obj2 = new I();
		obj2.test1();
		obj2.test2();
		obj2.test3();
		System.out.println("done");
	}
}