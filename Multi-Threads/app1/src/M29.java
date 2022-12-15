class W extends Thread
{
	@Override
	public void run() {
		System.out.println("run begin");
		int i = 10 / 0;
		System.out.println("run end");
	}
}
public class M29 {

	//main thread executes succesfully
	//only child thread received unhandled exception object child thread only terminating
	public static void main(String[] args) {
		W obj = new W();
		obj.start();
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i);
		}
	}

}
