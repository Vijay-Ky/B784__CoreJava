class Test35
{
	static <T, S> S test (T obj1, S obj2)
	{
		return obj2;
	}
}
class M67
{
	public static void main(String[] args)
	{
		String s1 = Test35.<Integer, String> test(100, "dfd");
		System.out.println("done with: " + s1);	
	}
}