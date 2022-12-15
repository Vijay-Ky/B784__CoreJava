class Z extends Thread
{
	Z()
	{
		start();
	}
	@Override
	public void run() {
		System.out.println("run begin");
		//child thread receiving abnormal condition
		start();
		System.out.println("run end");
	}
}
public class M32 {

	public static void main(String[] args) {
		System.out.println(1);
		Z z1 = new Z();
		System.out.println(2);
	}
}
