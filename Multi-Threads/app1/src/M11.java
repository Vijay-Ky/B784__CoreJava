public class M11 {

	public static void main(String[] args) {
		Thread  t1 = Thread.currentThread();
		//we can change the name of any thread including the main thread
		System.out.println(t1.getName());
		t1.setName("a new name to main thread");
		System.out.println(t1.getName());
	}
}
