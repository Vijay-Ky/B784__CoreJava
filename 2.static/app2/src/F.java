class F
{
	static int i;
	public static void main(String[] args)
	{
		System.out.println("from main: " + i);
		System.out.println("from main: " + F.i);
	}
}
class G
{
	public static void main(String[] args)
	{
		System.out.println("from main: " + F.i);
	}
}
