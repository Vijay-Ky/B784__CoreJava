class E
{
	static void test1()
	{
		System.out.println("from test1.E");
	}
}

class F extends E
{
	static void test1()
	{
		System.out.println("from test1.F");
	}
	public static void main(String[] args) 
	{
		E e1 = new F();
		e1.test1();
	}
}
