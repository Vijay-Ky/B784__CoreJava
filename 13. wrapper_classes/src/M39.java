public class M39
{
	static void test(Byte b)
	{
		System.out.println("Byte");
	}
	//first preference given to widening
	static void test(int i)
	{
		System.out.println("int");
	}
	public static void main(String [] args)
	{
		byte b1 = 10;
		test(b1);
	}
}
