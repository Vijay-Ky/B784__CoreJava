class X
{
	int i;
	static void test(X obj1, X obj2)
	{
		int i = obj1.i;
		obj1.i = obj2.i;
		obj2.i = i;
	}
	public static void main(String[] args)
	{
		X x1 = new X(), x2 = new X();
		x1.i = 10;
		x2.i = 20;
		System.out.println(x1.i);
		System.out.println(x2.i);
		test(x1, x2); 
		System.out.println(x1.i);
		System.out.println(x2.i);
	}
}