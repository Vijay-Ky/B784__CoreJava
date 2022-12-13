public class M8
{
	public static void main(String [] args)
	{
		String s1 = "true";
		String s2 = "false";
		String s3 = "10Z";
		String s4 = "TRUE";
		String s5 = "FALSE";
		Boolean b1 = new Boolean(s1);
		Boolean b2 = new Boolean(s2);
		//if something is other than true its false
		//compiler considers s3 as false
		Boolean b3 = new Boolean(s3);
		Boolean b4 = new Boolean(s4);
		Boolean b5 = new Boolean(s5);
		boolean p1 = b1.booleanValue();
		boolean p2 = b2.booleanValue();
		boolean p3 = b3.booleanValue();
		boolean p4 = b4.booleanValue();
		boolean p5 = b5.booleanValue();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println("done");
	}
}
