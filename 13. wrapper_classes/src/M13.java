public class M13
{
	public static void main(String [] args)
	{
		//two overloaded valueOf methods are available inside Double class
		String s1 = "90.9";
		//Double d1 = new Double(s1);
		Double d1 = Double.valueOf(s1);
		double d2 = d1.doubleValue();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("done");
	}
}
/*
static Double valueOf(double d)	
Returns a Double instance representing the specified double value.
static Double	valueOf?(String s)	
Returns a Double object holding the double value represented by the argument string s.
*/