class C extends Thread
{
	@Override
	public void run()
	{
		for (int i = 1; i <= 100; i++)
		{
			System.out.println("first thread: " + i);
		}
	}
}
class D extends Thread
{
	@Override
	public void run()
	{
		for (int i = 101; i <= 200; i++)
		{
			System.out.println("second thread: " + i);
		}
	}
}
class E 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.start();

		D d1 = new D();
		d1.start();

		for (int i = 201; i <= 300; i++)
		{
			System.out.println("main thread: " + i);
		}

	}
}
