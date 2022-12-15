public class M42
{
	static void test(String...str)
	{
		System.out.println("var args");
	}
	public static void main(String [] args)
	{
		test();
		test("abc");
		test("msg1", "xyz", "hello");
	}
}
