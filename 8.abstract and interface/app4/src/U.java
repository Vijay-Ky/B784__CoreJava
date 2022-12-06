class U
{
	void test1()
	{
		System.out.println("from test1");
	}
}
interface V
{
	void test2();
}
class W extends U implements V
{
	public void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[]args)
	{
		W obj = new W();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
