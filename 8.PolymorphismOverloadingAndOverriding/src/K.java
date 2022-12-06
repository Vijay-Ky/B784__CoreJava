class J
{
	//void test1(int i)
	static void test1(int i)
	{
		System.out.println("from test1.J");
	}
}

class K extends J
{
	//void test1()
	static void test1()
	{
		System.out.println("from test1.K");
	}
	public static void main(String[] args) 
	{
		//J j1 = new J();
		//j1.test1(10);
		//K k1 = new K();
		//k1.test1(10);
		//k1.test1();
		//J j2 = new K();
		//j2.test1();
		//j2.test1(10);
	}
}
