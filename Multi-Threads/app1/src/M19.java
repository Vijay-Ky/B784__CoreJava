class O extends Thread
{
	@Override
	public void run() {
		System.out.println("from O thread: " + getPriority());
	}
}
class P extends Thread
{
	@Override
	public void run() {
		//default priority of the child thread is the priority of the parent thread
		System.out.println("from P thread: " + getPriority());
		setPriority(7);
		//creating another thread
		//now O is child thread to P
		//now O gets the priority of the Parent thread P
		O th1 = new O();
		th1.start();
	}
}
public class M19 {

	public static void main(String[] args) {
		System.out.println("Initial Priority main: " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		P p1 = new P();
		p1.start();
	}
}
/*
 * only main thread priority is 5
 * child thread priority is the priority of its parent thread
 */
