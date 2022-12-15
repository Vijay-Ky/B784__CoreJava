class L implements Runnable
{
	@Override
	public void run() {
		System.out.println("child thread");
	}
}
public class M16 {

	public static void main(String[] args) {
		L l1 = new L();
		Thread t1 = new Thread(l1);
		t1.start();
		System.out.println(t1.getName());
		t1.setName("first child");
		System.out.println(t1.getName());
	}
}
