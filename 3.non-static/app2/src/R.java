class R
{
	R()
	{
		System.out.println("R()");
	}
	R(int i)
	{
		System.out.println("R(int)");
		this();
	}
	public static void main(String[]args)
	{
		R r1 = new R();
		System.out.println("-----");
		R r2 = new R(20);
		System.out.println("-----");
	}
}