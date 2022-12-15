public class M29
{
	static void test(int i)
	{
		System.out.println("done");
	}
	public static void main(String [] args)
	{
		Integer obj = new Integer(90);
		//no need of unboxing user has done it.
		test(obj.intValue());
	}
}
