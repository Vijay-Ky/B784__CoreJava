class Test36
{
	<T, S> S test(T obj1, S obj2)
	{
		return obj2;
	}
}
class M68
{
	public static void main(String[] args)
	{
		Test36 a1 = new Test36();
		String s1 = a1.<Integer, String> test(100, "abc");
		int i = a1.<Integer, Integer> test(100, 500);
		System.out.println("done with: " + s1);	
		System.out.println("done with: " + i);	
	}
}