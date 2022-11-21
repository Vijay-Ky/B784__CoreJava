class U
{
	public static void main(String[] args)
	{
		int i = 0;
		do
		{
			System.out.println("begin: " + i);
			i++;
			if(i > 3)
			{
				break;
			}
			System.out.println("end: " + i);
		}
		while (i < 10);
	}
}