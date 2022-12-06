class Manager12
{
	public static void main(String[] args)
	{
		A a1 = (A) new B();//doing explicitly
		A a2 = new B();
		C c1 = new D();
		C c2 = (C) new D();//doing explicitly
		System.out.println("done");
	}
}