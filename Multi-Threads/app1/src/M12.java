public class M12 {

	public static void main(String[] args) {
		Thread  t1 = Thread.currentThread();
		System.out.println(t1.isDaemon());
		//before starting only we can convert it to daemon 
		 //trying to convert after starting resulting in Exception.
		//RE - ITSE
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
	}
}