class J extends Thread
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
class K 
{
	public static void main(String[] args) 
	{
		J j1 = new J();
		j1.start();
		System.out.println("done");
	}
}
