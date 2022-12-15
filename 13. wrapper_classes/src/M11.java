public class M11
{
	public static void main(String [] args)
	{
		double d1 = 45.987;
		String s1 = "67.9898";
		Double  d2 = new Double(d1);
		Double d3 = new Double(s1);
		double d4 = d2.doubleValue();
		double d5 = d3.doubleValue();
		System.out.println("done");
	}
}
