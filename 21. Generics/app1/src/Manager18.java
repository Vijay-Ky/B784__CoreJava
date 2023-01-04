class Test < X >
{
}
class Manager18
{
	static void test(Test <?> a1)
	{
	}

	public static void main(String[] args) 
	{
		Test <? extends Number> a1 = null;

		a1 = new Test<Number>();
		a1 = new Test<Integer>();
		a1 = new Test<Double>();
		a1 = new Test<Byte>();

		System.out.println("done");
	}
}
