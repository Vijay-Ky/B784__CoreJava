public class M23
{
	public static void main(String [] args)
	{
		int i = 10;
		//JDK 1.5 compiles successfully
		//JDK 1.4 compilation fails
		int j = new Integer(10);//unboxing
		System.out.println("done");
	}
}
