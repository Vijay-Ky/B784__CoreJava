class W 
{
	void test()
	{
		System.out.println("from int.test.W");
	}	
}
class X extends W
{
	void test(int a)
	{
		System.out.println("from void.test.X");
	}
	public static void main(String[] args) 
	{
		X x1 = new X();
		x1.test();
		x1.test(10);
	}
}
