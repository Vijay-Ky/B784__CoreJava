class F
{
	int i;
	F(int k)
	{
		i = 10;
		System.out.println("F()");
	}
	public static void main(String[]args)
	{
		F f1 = new F();
		System.out.println(f1.i);
	}
}