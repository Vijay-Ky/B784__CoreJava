class V extends Thread
{
	@Override
	public void run() {
		System.out.println("run begin");
		Util.sleep(10000);
		System.out.println("run end");
	}
}
public class M27 {

	public static void main(String[] args) {
		System.out.println("main begin");
		V obj = new V();
		obj.start();
		Util.sleep(2000);
		//sleeping thread can be interrupted
		//when the thread is in sleep if we call interrupt coming away from the sleep with the exception
		obj.interrupt();
		System.out.println("main end");
	}
}
