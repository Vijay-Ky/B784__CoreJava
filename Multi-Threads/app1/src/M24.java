public class M24 {

	public static void main(String[] args) {
		System.out.println("main begin");
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
			try
			{
				//sleep method is a static method
				//sleep method is a overloaded method.
				//milliseconds and nano seconds
				Thread.sleep(2000, 500);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("main end");
	}
}
