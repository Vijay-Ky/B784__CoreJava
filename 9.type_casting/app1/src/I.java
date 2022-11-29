class I
{
	static float test1(int i)
	{
		return test2(i);
	}
	static long test2(int i)
	{
		return i;
	}
	public static void main(String[]args)
	{
		byte b = 10;
		double d = test1(b);
		System.out.println(d);
		System.out.println("done");
	}
}