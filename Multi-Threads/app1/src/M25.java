class T extends Thread
{
	public void run() {
		System.out.println("run begin");
		for(int i = 100; i <= 110; i++)
		{
			System.out.println(i);
			try
			{
				//we can call straight away bcz T extends Thread
				sleep(5000, 500);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("run end");
	}
}
public class M25 {

	public static void main(String[] args) {
		T obj = new T();
		obj.start();
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000, 500);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("main end");
	}
}
