class C
{
	void test1()
	{
		System.out.println("from test1.C");
	}
}

class D extends C
{
	void test1()
	{
		System.out.println("from test1.D");
	}
	public static void main(String[] args) 
	{
		//D d1 = new D();
		//d1.test1();
		C c1 = new D();
		c1.test1();
	}
}
