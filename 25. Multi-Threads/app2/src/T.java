class S extends Thread
{
	S()
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
class T 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		S s1 = new S();
		System.out.println("main end");
	}
}
