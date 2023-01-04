class Test
{
	static <T> void test(T obj1, T obj2)
	{
	}
}
class Manager25 
{
	public static void main(String[] args) 
	{
		Test.<Integer> test(100, 200);
		System.out.println("done");
	}
}
