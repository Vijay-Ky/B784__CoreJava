class O implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 1; i <= 100; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
class P
{
	public static void main(String[] args) 
	{
		O o1 = new O();
		Thread t1 = new Thread(o1);
		o1.run();

		for (int i = 101; i <= 200; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
