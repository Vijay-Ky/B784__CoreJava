package pack1;
class F 
{
	private static int i = 90;
	static void test()
	{
		System.out.println(i);
	}
}
class G
{
	public static void main(String[] args) 
	{
		System.out.println(F.i);
	}
}
