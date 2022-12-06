class J
{
	static short test1(byte b)
	{
		return b;
	}
	static float test2(byte b)
	{
		return test1(b);
	}
	public static void main(String[]args)
	{
		byte b = 10;
		double d = test2(b);
		System.out.println("done");
	}
}