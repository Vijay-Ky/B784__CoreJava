class Manager11
{
	static A test1(C c1)
	{
		return (A)test2(c1);
	}
	static B test2(C c1)
	{
		return (B)c1;
	}
	public static void main(String[] args)
	{
		D d1 = new D();
		Object o1 = (Object)test1(d1);
		System.out.println("done");
	}
}