class P
{
	static int i;
	public static void main(String[] args)
	{
		System.out.println(i);
		int i = 10;
		System.out.println(i);
		System.out.println(P.i);
		i = 20;
		System.out.println(i);
		System.out.println(P.i = 100);
	}
}
