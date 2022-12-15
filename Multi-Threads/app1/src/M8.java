class H implements Runnable
{
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
public class M8 {

	public static void main(String[] args) {
		H h1 = new H();

		Thread t1 = new Thread(h1);
		
		//multithreaded o/p
		//t1.start();
		
		//sequential o/p
		//h1.run();
		
		//sequential o/p
		//Thread class run method internally calling to the H class run method.
		t1.run();
		for(int i = 21; i <= 30; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
