class Util 
{
	public static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch (InterruptedException ex)
		{
			System.out.println("Interruption Handled");
			ex.printStackTrace();
		}
	}

	public static void sleep(long millis, int nano)
	{
		try
		{
			Thread.sleep(millis, nano);
		}
		catch (InterruptedException ex)
		{
			System.out.println("Interruption Handled");
			ex.printStackTrace();
		}
	}
}
