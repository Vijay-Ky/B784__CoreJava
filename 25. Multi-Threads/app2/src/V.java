class U extends Thread
{
	U()
	{
		start();
	}

	@Override
	public void run() 
	{
		System.out.println("run begin");
		System.out.println("run end");
	}
}
class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		U u1 = new U();
		u1.start();
		System.out.println("main end");
	}
}
