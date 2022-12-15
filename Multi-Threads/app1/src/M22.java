class S extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i);
		}
	}
}
public class M22 {

	public static void main(String[] args) {
		S s1 = new S();
		s1.start();
		try
		{
			//main thread keeps on waiting for the s1 to finish.
			//after starting it going to the waiting state keeps on waiting till child thread completely gets over.
			//once the child thread gets over it will resume back.
			//main is calling join on s1.
			s1.join();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
		System.out.println("done");
	}
}