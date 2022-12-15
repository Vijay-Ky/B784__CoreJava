public class M30
{
	public static void main(String [] args)
	{
		Double d1 = new Double(20.0);
		double d2 = 40.0;
		//d1 is the reference type
		test(d1);
		//boxing d2 and making Double object
		test(new Double(d2));
	}
	static void test(Double obj)
	{
		System.out.println(obj);
		System.out.println("done");
	}
}
