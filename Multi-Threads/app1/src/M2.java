public class M2
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 100; i++)
		{
			System.out.println("loop1: " + i);
		}
		//after completing first for loop
		for(int i = 200; i <= 300; i++)
		{
			System.out.println("loop2: " + i);
		}
		//after completing second for loop
		for(int i = 400; i <= 500; i++)
		{
			System.out.println("loop3: " + i);
		}
	}
}
//only one thread executing this program so sequential output.