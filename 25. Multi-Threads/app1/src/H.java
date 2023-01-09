class F implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 1; i <= 100; i++)
		{
			System.out.println("first child: " + i);
		}
	}
}
class G implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 101; i <= 200; i++)
		{
			System.out.println("second child: " + i);
		}
	}
}
class H 
{
	public static void main(String[] args) 
	{
		F f1 = new F();
		Thread t1 = new Thread(f1);
		t1.start();

		G g1 = new G();
		Thread t2 = new Thread(g1);
		t2.start();

		for (int i = 201; i <= 300; i++)
		{
			System.out.println("main thread: " + i);
		}
	}
}
