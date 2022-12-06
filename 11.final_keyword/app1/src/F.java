class F
{
	public static void main(String[]args)
	{
		F f1 = new F();
		final F f2 = new F();
		f2 = f1;
		System.out.println("done");
	}
}
