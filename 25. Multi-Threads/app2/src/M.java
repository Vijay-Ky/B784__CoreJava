class L extends Thread
{
	@Override
	public void run()
	{
		for (int i = 1; i <= 100; i++ )
		{
			System.out.println(i);
		}
	}
}
class M 
{
	public static void main(String[] args) 
	{
		L l1 = new L();
		l1.start();
		try
		{
			l1.join();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
	}
}
