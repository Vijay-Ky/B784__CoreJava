public class M25
{
	public static void main(String [] args)
	{
		//valid in all the versions of JDK.
		Double d1 = new Double(20);
		double d2 = d1.doubleValue();//user only does unboxing
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("done");
	}
}
