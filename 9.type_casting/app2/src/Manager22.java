class Manager22
{
	public static void main(String[] args)
	{
		A a1 = new B();
		B b1 = (B)a1;
		System.out.println("--------");
		A a2 = new A();
		B b2 = (B)a2;
		System.out.println("--------");
	}
}