class I
{
	static int m;
	int n;
	static void test1()
	{
		System.out.println("from test1");
	}
	void test2()
	{
		System.out.println("from test2");
	}
}
class J extends I
{
	public static void main(String[] args) 
	{
		System.out.println(J.m);
		J.test1();

		J ref = new J();
		System.out.println(ref.n);
		ref.test2();
	}
}
