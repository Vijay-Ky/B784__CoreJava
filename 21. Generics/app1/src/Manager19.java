class Test < X >
{
}
class Manager19
{
	static void test(Test <?> a1)
	{
	}

	public static void main(String[] args) 
	{
		Test <? extends P> a1 = null;

		a1 = new Test<P>();
		a1 = new Test<Q>();
		a1 = new Test<R>();
		a1 = new Test<S>();

		System.out.println("done");
	}
}
