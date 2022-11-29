class B
{
	B()
	{
		//super()
		//this()
		//IIB
		System.out.println("B()");
	}

	{
		System.out.println("IIB");
	}

	public static void main(String[]args)
	{
		B b1 = new B();
		System.out.println("-----");
		B b2 = new B();
		System.out.println("-----");
	}
}