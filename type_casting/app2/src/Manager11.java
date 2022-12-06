class Manager11
{
	static A test1(C c1)
	{
		return test2(c1);
	}
	static B test2(C c1)
	{
		return c1;
	}
	public static void main(String[] args)
	{
		D d1 = new D();
		Object o1 = test1(d1);
		System.out.println("done");
	}
}