class I extends Thread
{
	@Override
	public void run()
	{
		for (int i = 1; i <= 100; i++)
		{
			System.out.println(getName() + ":" + i);
		}
	}
}
class J 
{
	public static void main(String[] args) 
	{
		I i1 = new I();
		i1.start();
		//i1.start();

		I i2 = new I();
		i2.start();

		for (int i = 101; i <= 200; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
