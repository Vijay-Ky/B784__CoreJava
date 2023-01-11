class H extends Thread
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
class I 
{
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.setDaemon(true);
		h1.start();
		System.out.println("done");
	}
}
