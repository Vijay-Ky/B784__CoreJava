class M7
{
	@Deprecated
	void test1()
	{
	}
	void test2()
	{
	}
}

class M8
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		M7 m = new M7();
		m.test1();
		m.test2();
		System.out.println("done");
	}
}
