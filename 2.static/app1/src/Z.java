class Z
{
	static int i = test();
	static int j = 10;

	public static void main(String[]args)
	{
		System.out.println(i);
		System.out.println(j);
	}

	static int test()
	{
		return j;	
	}
}
