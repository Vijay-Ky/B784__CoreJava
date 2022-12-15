class M5 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		try
		{
			System.out.println(2);
			if(true)
			{
				throw new ArithmeticException();
				//System.out.println(3);
			}
		}
		catch (ArithmeticException ex)
		{
			System.out.println(4);
		}
		System.out.println(5);
	}
}
/* its not the recommende way of developement 
we cant achieve anything here.
*/
