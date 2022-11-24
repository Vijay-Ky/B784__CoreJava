class Y
{
	static int i = 10;
	static int j = test();
	static int test()
	{
		return i;
	}
	public static void main(String[]args)
	{
		System.out.println(i);
		System.out.println(j);
	}
}
