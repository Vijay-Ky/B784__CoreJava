abstract class V
{
	V()
	{
		System.out.println("V()");
	}
}
class W extends V
{
	W()
	{
		System.out.println("W()");
	}
	public static void main(String[]args)
	{
		W w1 = new W();
		System.out.println("done");
	}
}