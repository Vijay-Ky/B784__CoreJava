class U
{
	public static void main(String[] args)
	{
		boolean flag = true;
		if((flag = false) && (flag = true))
		{
			System.out.println("from if");
		}
		System.out.println("end of main");
		System.out.println(flag);
	}
}