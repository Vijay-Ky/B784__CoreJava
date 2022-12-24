class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			int i = 0;
		}
		catch (ArithmeticException ex)
		{
			System.out.println("catch" + i);
		}
		System.out.println("end of main" + i);//local variable of try should not be used in outside the try.
	}
}
