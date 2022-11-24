class C
{
	C()
	{
		System.out.println("C()");
	}
	{
		System.out.println("IIB");
	}
	C(int i)
	{
		System.out.println("C(int)");
	}
	public static void main(String[]args)
	{
		C c1 = new C();
		System.out.println("-----");
		C c2 = new C(20);
		System.out.println("-----");
	}
}