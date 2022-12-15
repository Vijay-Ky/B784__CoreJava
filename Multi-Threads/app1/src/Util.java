//if we have more thread to set sleep it will be lengthy development
//instead create one util class
public class Util {
	public static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch(InterruptedException ex)
		{
			System.out.println("Sleeping got interrupted and Exception handled successfully, flow is normal");
			ex.printStackTrace();
		}
	}
	public static void sleep(long millis, int nano)
	{
		try
		{
			Thread.sleep(millis, nano);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
