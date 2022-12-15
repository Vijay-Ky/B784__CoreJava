public class M40
{
	static void test(Long d1)
	{
		System.out.println("Long");
	}
	static void test(float f1)
	{
		System.out.println("float");
	}
	//first preference for the auto widening
	static void test(double d1)
	{
		System.out.println("double");
	}
	public static void main(String [] args)
	{
		long lon = 10;
		test(lon);
	}
}
