public class M31
{
	static void test(Character obj)
	{
		System.out.println("done");
	}
	public static void main(String [] args)
	{
		test('a');//CE in JDK<=1.4
		char c1 = 't';
		test(c1);//CE in JDK<=1.4
		Character c2 = 'p';//CE in JDK<=1.4
		test(c2);
	}
}
