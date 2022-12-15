class M6
{
	public static void main(String[] args) 
	{
		//Thread.sleep(10000);//checked type of exception requires try and catch
		try
		{
			Thread.sleep(10000);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
