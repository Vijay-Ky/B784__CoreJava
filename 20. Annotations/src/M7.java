class M6
{
	@Deprecated
	void test1()
	{
	}
	void test2()
	{
	}
}

class M7 
{
	public static void main(String[] args) 
	{
		M6 m = new M6();
		m.test1();
		m.test2();
		System.out.println("done");
	}
}
