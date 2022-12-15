class M15 
{
	public static void main(String[] args) //throws InterruptedException
	{
		
		try
		{
			System.out.println(1000);
			Class.forName("");//min one Class.forName max any no. of we can keep
			Class.forName("");
			Class.forName("");
		}
		
		catch (ClassNotFoundException ex)
		{
		}
		//System.out.println("done");
		try
		{
			Class.forName("");
			Thread.sleep(10000);
		}
		catch (ClassNotFoundException ex)
		{
		}
		catch (InterruptedException ex)
		{
		}
		try
		{
			Class.forName("");
			Thread.sleep(10000);
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
		}
		catch (InterruptedException ex)
		{
		}
		System.out.println("done");
	}
}