public class M44
{
	static void test(String...varArg)
	{ 
		//by default var-arg is an array
		//iterating an array by using for-each loop
		for(String s1 : varArg)
		{
			System.out.print(s1 + ",");
		}
		System.out.println();
	}
	public static void main(String [] args)
	{
		test("abc");
		test("hello","test");
		test("hello","test","xyz");
		test("hello","test","xyz","abc");
	}
}
