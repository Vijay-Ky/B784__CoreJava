public class M26
{
	public static void main(String [] args)
	{
		int i = 10;
		Integer j = new Integer(10);
		int k = j.intValue();
		Integer m = j;
		System.out.println(j == m);
		System.out.println("done");
	}
}
