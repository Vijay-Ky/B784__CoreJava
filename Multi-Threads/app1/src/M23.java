public class M23 {

	public static void main(String[] args) {
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
			try
			{
				//sleep method is a static method
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("main end");
	}
}
