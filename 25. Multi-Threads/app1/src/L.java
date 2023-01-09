class K implements Runnable
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
class L 
{
	public static void main(String[] args) 
	{
		K k1 = new K();
		Thread t1 = new Thread(k1);
		t1.start();

		Thread t2 = new Thread(k1);
		t2.start();

		for (int i = 101; i <= 200; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
