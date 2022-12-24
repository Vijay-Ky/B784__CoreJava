class M5
{
	public static void main(String[] args) 
	{
		test1();
		System.out.println("done");
	}
	static void test1() 
	{
		test2(); 
	}
	static void test2()
	{
		int i = 10 / 0;//compiler doest care in case of unchecked exception 
	}
}