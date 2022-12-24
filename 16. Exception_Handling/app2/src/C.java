class C 
{
	public static void main(String[] args) 
	{
		int i = 10;
		try
		{
			System.out.println("try: " + i);
			i = 20;
	
		}
		catch (ArithmeticException ex)
		{
			System.out.println("try: " + i);
			i = 30;	
		}
		System.out.println("main end: " + i);
	}
}
