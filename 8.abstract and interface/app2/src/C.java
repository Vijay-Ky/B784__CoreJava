interface C
{
	int i = 10;
	static final int j = 20;
	final static int k = 30;

	//static void test1();
	void test1();
	public abstract void test2();
	abstract void test3();
	abstract void test4();

	//1.8 JDK features
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