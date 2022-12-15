public class M28
{
	static void test(int i)
	{
		System.out.println("done");
	}
	public static void main(String [] args)
	{
		Integer obj = new Integer(10);
		test(obj);//test(obj.intValue());
	}
}
