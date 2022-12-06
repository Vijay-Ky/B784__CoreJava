class H 
{
	static int test(short s)
	{
		return s;
	}
	public static void main(String[]args)
	{
		byte b = 10;
		double d = test(b);
		System.out.println(d);
	}
}