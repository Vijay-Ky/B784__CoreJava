public class M4
{
	public static void main(String [] args)
	{
		boolean b1 = false;//b1 is primitive type
		//b1 value boxing into Boolean Object then it is 
		//pointed by the reference variable b2
		Boolean b2 = new Boolean(b1);//b2 is reference type
		Boolean b3 = new Boolean(true);//b3 is reference type
		boolean b4 = b2.booleanValue();//b4 is primitive
		boolean b5 = b3.booleanValue();//b5 is primitive
		System.out.println(b4);
		System.out.println(b5);
		System.out.println("done");
	}
}
