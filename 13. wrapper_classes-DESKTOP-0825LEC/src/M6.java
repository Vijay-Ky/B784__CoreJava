public class M6
{
	public static void main(String [] args)
	{
		String s1 = "9.989";
		//in case of float and double special character
		// . is allowed
		//boxing from the content of the string object
		Double d1 = new Double(s1);
		double d2 = d1.doubleValue();//unboxing
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("done");
	}
}
