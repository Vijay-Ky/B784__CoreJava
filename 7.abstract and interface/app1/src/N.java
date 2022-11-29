abstract class N
{
	void test1()
	{
		System.out.println("from test1");
	}
}
class O extends N
{
	public static void main(String[]args)
	{
		//N n1= new N();
		//n1.test1();
		System.out.println("------");
		O o1 = new O();
		o1.test1();
		System.out.println("------");
	}
}