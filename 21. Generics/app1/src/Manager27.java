class Test
{
	static <T, S> S test(T obj1, S obj2)
	{
		return obj2;
	}
}
class Manager27
{
	public static void main(String[] args) 
	{
		String s1 = Test.<Integer, String> test(100, "abc");
		System.out.println("done" + s1);
	}
}
