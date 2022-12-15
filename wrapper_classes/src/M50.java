public class M50
{
	static void test(double d)
	{
		System.out.println("double");
	}
	static void test(int i)
	{
		System.out.println("int");
	}
	static void test(Byte b1)
	{
		System.out.println("Byte");
	}
	static void test(Double d1)
	{
		System.out.println("Double");
	}
	static void test(Integer i)
	{
		System.out.println("Integer");
	}
	static void test(Float f)
	{
		System.out.println("Float");
	}
	
	//auto-upcasting will be given the first preference
	static void test(Number n1)
	{
		System.out.println("Number");
	}
	
	static void test(Object obj)
	{
		System.out.println("Object");
	}
	static void test(byte...b)
	{
		System.out.println("var-arg");
	}
	public static void main(String [] args)
	{
		byte b1 = 10;
		//byte cant be convert into Double, Object
		test(b1);
	}
}
	
