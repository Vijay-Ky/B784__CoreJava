class Test < X >
{
}
class Manager17 
{
	static void test(Test <?> a1)
	{
	}

	public static void main(String[] args) 
	{
		test(new Test<Integer>());
		test(new Test<Object>());
		test(new Test<P>());
		test(new Test<String>());
		test(new Test<Thread>());

		System.out.println("done");
	}
}
