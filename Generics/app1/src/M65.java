class Test33
{
	static <T> void test (T obj1, T obj2)
	{
	}
}
class M65
{
	public static void main(String[] args)
	{
		Test33.<Integer> test(100, 200);
		Test33.<Integer> test("abc", "xyz");
		System.out.println("done");	
	}
}