class Shared
{
	synchronized void test1(Shared obj)
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test1(obj) begin by: " + t1.getName());
		Util.sleep(1000);
		//current thread is executing s1 object
		//s1 lock is still with the Thread1
		//Thread1 is trying to access synchronized test2
		obj.test2(this);
		System.out.println("test1(obj) end by: " + t1.getName());
	}

	synchronized void test2(Shared obj)
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test2(obj) begin by: " + t1.getName());
		Util.sleep(1000);
		//current thread is executing s2 object
		//s2 lock is still with the Thread2
		//Thread2 is trying to access synchronized test1
		obj.test1(this);
		System.out.println("test2(obj) end by: " + t1.getName());
	}
}
class Thread1 extends Thread
{
	Shared s1, s2;
	Thread1(Shared s1, Shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run()
	{
		s1.test1(s2);
	}
}
class Thread2 extends Thread
{
	Shared s1, s2;
	Thread2(Shared s1, Shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public void run()
	{
		s2.test2(s1);
	}
}
class M7
{
	public static void main(String[] args) 
	{
		Shared s1 = new Shared();
		Shared s2 = new Shared();

		Thread1 t1 = new Thread1(s1, s2);
		t1.start();

		Util.sleep(1000);
		
		Thread2 t2 = new Thread2(s1, s2);
		t2.start();

		Util.sleep(100);
	}
}
