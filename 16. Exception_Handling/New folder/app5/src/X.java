class X
{
	public static void main(String[] args )
	{	
		try
		{
			int i=10/0;
		}
		catch(Throwable t)
		{
			System.out.println(1);
		}
		catch(Exception t)
		{
			System.out.println(2);
		}
		catch (RuntimeException t)
		{
			System.out.println(1);
		}
		catch(ArithmeticException t)
		{
			System.out.println(2);
		}
		System.out.println(1);
	}
}