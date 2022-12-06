abstract class F
{
	abstract void test1();
	void test2()
	{
		System.out.println("from test2");
	}
}
class G extends F
{
	void test1()
	{
		System.out.println("from test1");
	}
	public static void main(String[]args)
	{
		//F f1 = new F();
		G g1 = new G();
		//f1.test1();
		//f1.test2();
		g1.test1();
		g1.test2();
		System.out.println("done");
	}
}