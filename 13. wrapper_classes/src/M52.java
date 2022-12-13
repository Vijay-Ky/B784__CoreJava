public class M52
{
	static void test(Double d1)
	{
		System.out.println("Double");
	}
	//there is no suitable boxing and auto widening arg
	//last preference given to the var-arg
	static void test(byte...b)
	{
		System.out.println("var-arg");
	}
	public static void main(String [] args)
	{
		byte b1 = 10;
		test(b1);
	}
}
	
