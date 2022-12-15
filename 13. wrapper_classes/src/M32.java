public class M32
{
	public static void main(String [] args)
	{
		Boolean b1 = new Boolean(true);
		//if block requires boolean primitive
		//error if in case of JDK<=1.4
		//in case of JDK>=1.5, compiler only unboxing and getting the primitive
		if(b1)//if(b1.booleanValue())user only doing unboxing fine with JDK<=1.4
		{
			System.out.println("done");
		}
	}
}
