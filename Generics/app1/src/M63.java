class Test31
{
	static <T> void test (T obj1, T obj2)
	{
	}
}
class M63
{
	public static void main(String[] args)
	{
		Test31.<Integer>test(100, 200);
		Test31.<String>test("abc", "xyz");
		System.out.println("done");	
	}
}