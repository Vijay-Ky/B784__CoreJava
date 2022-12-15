class G extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++)
		{
			//even getName is available in Thread we are using this syntax
			//currentThread() method always returns the thread whichever executing currentThread() method.
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
public class M7 {

	public static void main(String[] args) {
		G g1 = new G();
		//g1.start();
		//instead of calling start method if we call run method
		//main thread only goes to run method not the child thread
		//we dont get multithreaded output we get sequential o/p
		//first executes entirely run method then only remaining portion of run method.
		//even though child Thread created it is not registered with the thread scheduler.
		g1.run();
		for(int i = 201; i <= 300; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
