class U
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = ++i + i + ++i + i;//
		i = 0;
		int k = --i + i + --i + i;//
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}