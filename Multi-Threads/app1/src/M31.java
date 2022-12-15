class Y extends Thread
{
	Y()
	{
		start();
	}
	@Override
	public void run() {
		System.out.println("run begin");
		System.out.println("run end");
	}
}
public class M31 {

	public static void main(String[] args) {
		System.out.println(1);
		//while creating the thread itself it is stating in the constructor
		//we can call it as auto-start
		Y y1 = new Y();
		//Exception we are calling start 2 times.
		y1.start();
		System.out.println(2);
	}

}
