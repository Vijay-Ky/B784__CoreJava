class X extends Thread
{
	X()
	{
		start();
	}
	@Override
	public void run() {
		System.out.println("run begin");
		System.out.println("run end");
	}
}
public class M30 {

	public static void main(String[] args) {
		
		//while creating the thread itself it is starting in the constructor
		//we can call it as auto-start
		X x1 = new X();
		for(int i = 0; i <= 10; i++)
		{
			System.out.println(i);
		}
	}

}
