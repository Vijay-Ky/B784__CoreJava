class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
	
		}
		catch (ArithmeticException ex)
		{
			int i = 20;
		}
		System.out.println("catch" + i);//local variable of catch should not be used in outside the catch block.
		System.out.println("end of main" + ex);//local variable of catch should not be used in outside the catch block.
	}
}
