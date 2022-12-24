public class M38
{
	//first preference given for widening
	static void test(double d1)
	{
		System.out.println("double");
	}
	//if there is no suitable method to widening then only considers boxing
	static void test(Integer obj)
	{
		System.out.println("Integer");
	}
	public static void main(String [] args)
	{
		int i = 20;
		test(i);
	}
}
