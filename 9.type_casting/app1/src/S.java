class S
{
	static int test(double d1)
	{
		return (int)d1;
	}
	public static void main(String[] args)	
	{
		long lon = test(10.9);
		System.out.println(lon);
	}
}

