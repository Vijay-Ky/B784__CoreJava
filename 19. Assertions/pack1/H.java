package pack1;
class H
{
	public static void main(String[] args)
	{
		System.out.println(1);
		//other than void works fine
		/*assert test(); 
		System.out.println(2);
	}
	static boolean test()
	{
		System.out.println("from test");
		return true;
	}*/
		assert true : test(); 
		System.out.println(2);
	}
	static int test()
	{
		System.out.println("from test");
		return 100;
	}
}