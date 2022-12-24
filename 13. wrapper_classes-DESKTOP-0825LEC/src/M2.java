public class M2
{
	public static void main(String [] args)
	{
		//double primitive boxed inside the Double object.
		//d1 is reference variable.
		Double d1 = new Double(10.09);//boxing
		//retrieving value Unboxing and assigning to d2.
		double d2 = d1.doubleValue();//un-boxing
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("done");
	}
} 