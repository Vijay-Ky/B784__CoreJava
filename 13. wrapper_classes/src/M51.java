public class M51
{
	static void test(Double d1)
	{
		System.out.println("Double");
	}
	//byte can be upcasted to Number and Number can be upcasted to Object
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
		test(b1);
	}
}
	
