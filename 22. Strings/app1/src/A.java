class A 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		System.out.println(s1);

		String s2 = new String("hello");
		System.out.println(s2);

		System.out.println(s1 == s2);
	}
}
