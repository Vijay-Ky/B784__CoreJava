class Test34
{
	static <T> void test (T obj1, T obj2)
	{
	}
}
class M66
{
	public static void main(String[] args)
	{
		Test34.<Integer> test (100, 200);
		Test34.test (2000, "xyz");
		System.out.println("done");	
	}
}