class G
{
	static void test1()
	{
		System.out.println("G-test1");
	}
}
class H extends G 
{
	static void test2()
	{
		System.out.println("H-test2");
	}
	public static void main(String[] args) 
	{
		H.test1();
		H.test2();
	}
}
