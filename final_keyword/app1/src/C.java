class C
{
	public static void main(String[]args)
	{
		final int i = 10;
		int j = i;
		System.out.println(i);
		System.out.println(j);
		j = (i + 10);
		System.out.println(i);
		System.out.println(j);
	}
}
