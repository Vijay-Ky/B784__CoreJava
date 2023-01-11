class Q extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("run begin");
		Util.sleep(10000);
		System.out.println("run end");
	}
}
class R 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Q q1 = new Q();
		q1.start();
		Util.sleep(1000);
		q1.interrupt();
		System.out.println("main end");
	}
}
