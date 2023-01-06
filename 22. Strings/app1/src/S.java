class S
{
	public static void main(String[] args) 
	{
		String s1 = null;
		try
		{
			System.out.println(s1.length());
		}
		catch (NullPointerException ex)
		{
		}
		System.out.println("end");
	}
}
