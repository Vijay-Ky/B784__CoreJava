public class M14 {

	public static void main(String[] args) {
		Thread  t1 = Thread.currentThread();
		System.out.println(t1.getPriority());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		
		t1.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t1.getPriority());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		
		//Exception - IAE
		//t1.setPriority(0);
		
		
	}

}
