public class M47
{
	
	static void test(int...x)//var-arg also an array
	{
	}
	
	static void test(int[] y)//an array 
	{
	}
	/*
	static void test(String[] y)//an array 
	{
	}*/

	public static void main(String[] args)
	{
		test(new int[20]);
	}
}
//CTE both we cant use in case of same method names
