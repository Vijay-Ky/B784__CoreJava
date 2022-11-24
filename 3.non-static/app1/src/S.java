class S
{
	int i;
	static void test1(int x)
	{
		System.out.println(x);
		x = 10;
		System.out.println(x);
	}
	static void test2(S s1)
	{
		s1.i = 20;
	}
	public static void main(String[] args)
	{
		S s1 = new S();
		s1.i = 30;
		System.out.println("A: " + s1.i);
		test1(s1.i);
		System.out.println("B: " + s1.i);
		test2(s1);
		System.out.println("C: " + s1.i);
	}
}