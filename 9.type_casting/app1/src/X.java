class X
{
	public static void main(String[] args)
	{
		double d1 = 10.90;
		System.out.println(test((byte)(short)(byte) d1));
	}
	static double test(byte i)
	{
		return i;
	}
}