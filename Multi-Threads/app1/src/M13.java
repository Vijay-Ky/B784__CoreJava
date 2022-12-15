public class M13 {

	public static void main(String[] args) {
		Thread  t1 = Thread.currentThread();
		System.out.println(t1.getPriority());
		//we can change the priority after starting no issues.
		//but change is allowed b/w 1 to 10
		t1.setPriority(10);
		System.out.println(t1.getPriority());
	}

}
