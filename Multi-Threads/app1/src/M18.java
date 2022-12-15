class N implements Runnable
{
	@Override
	public void run() {
		System.out.println("-----------------------------");
	}
}
public class M18 {

	public static void main(String[] args) {
		N obj = new N();
		//several constructors are available
		//reference to the runnable, name to the thread
		Thread t1 = new Thread(obj, "my first thread");
		t1.start();
		System.out.println(t1.getName());
		t1.setName("first child");
		System.out.println(t1.getName());
	}
}
