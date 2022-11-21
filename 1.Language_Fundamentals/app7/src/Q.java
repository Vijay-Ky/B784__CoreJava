class Q
{
	public static void main(String[] args)
	{
		System.out.println("main begin");
		int i = 10;
		do
		{
			System.out.println("body:" + i);
			i++;
		}
		while (i < 10);
		System.out.println("main end");
	}
}