class Shared
{
	void test1()
	{
		Thread t1 = Thread.currentThread();
		System.out.println("from test non-sync: " + t1.getName());
		synchronized(this)
		{
			for (int i = 1; i <= 20; i++)
			{
				System.out.println("from test1 sync: " + i + " by " + t1.getName());
			}
		}
	}

	void test2()
	{
		Thread t1 = Thread.currentThread();
		synchronized(this)
		{
			for (int i = 1; i <= 20; i++)
			{
				System.out.println("from test2: " + i + " by " + t1.getName());
			}
		}
	}
}
class Thread1 extends Thread
{
	Shared s1;
	Thread1(Shared s1)
	{
		this.s1 = s1;
	}

	@Override
	public void run()
	{
		s1.test1();
	}
}
class Thread2 extends Thread
{
	Shared s1;
	Thread2(Shared s1)
	{
		this.s1 = s1;
	}

	@Override
	public void run()
	{
		s1.test1();
	}
}
class M5
{
	public static void main(String[] args) 
	{
		Shared s1 = new Shared();

		Thread1 t1 = new Thread1(s1);
		Thread2 t2 = new Thread2(s1);

		t1.start();
		t2.start();

		s1.test1();
	}
}
