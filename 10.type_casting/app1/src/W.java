class W
{
	public static void main(String[] args)
	{
		double d1 = 10.9090;
		int i = (int)(double)(byte)(short)(int)(long)(float)(double)d1;
		System.out.println(i);
	}
}