public class M37
{
	static void test(int i)
	{
		System.out.println("int");
	}
		public static void main(String [] args)
	{
		int i = 20;
		Integer obj =new Integer(20);
		test(i);
		//error in case of JDK <= 1.4
		test(obj);
	}
}
