class Manager17
{
	public static void main(String[] args)
	{
		A a1 = new D();
		B b1 = (B) a1;
		C c1 = (C) b1;
		D d1 = (D) a1;
		System.out.println("done");
	}
}