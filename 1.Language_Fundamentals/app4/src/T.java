class T
{
	public static void main(String[] args)
	{
		int i = 0;
		if((++i == 1) && (i++ == 2))
		{
			System.out.println("from if");
			i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}
