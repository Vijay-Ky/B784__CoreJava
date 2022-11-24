class F
{
	{
		System.out.println("F-IIB1");
	}
	F(int i)
	{
		this();
		System.out.println("F(int)");
	}
	F()
	{
		System.out.println("F()");
	}
	public static void main(String[]args)
	{
		F f1 = new F();
		System.out.println("-----");
		F f2 = new F(50);
		System.out.println("-----");
	}
}