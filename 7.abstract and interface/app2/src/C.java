interface C
{
	static final int i = 10;
	static final int j = 20;
	final static int k = 30;

	void test1();
	public abstract void test2();
	abstract void test3();
	abstract void test4();

	static void test22()
	{
	}
	static void test33()
	{
	}
	default void test44()
	{
	}
}