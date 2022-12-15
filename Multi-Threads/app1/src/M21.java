class R extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i);
		}
	}
}
public class M21 {

	public static void main(String[] args) {
		R r1 = new R();
		r1.setDaemon(true);
		r1.start();
		System.out.println("done");
	}
}
/*
 * whenever parent is leaving child also leaving from the execution
 because child is a daemon thread.
 we can convert a thread to deamon before starting.
 -child thread life depends on the parent thread life
 */
