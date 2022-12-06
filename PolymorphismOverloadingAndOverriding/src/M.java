class L
{
	static void test1(int i)
	{
		System.out.println("from test1.L");
	}
}

class M extends L
{
	static void test1()
	{
		System.out.println("from test1.M");
	}
	public static void main(String[] args) 
	{
		M m1 = new M();
		m1.test1();
		m1.test1(10);
	}
}
