class Manager26
{
	public static void main(String[] args)
	{
		A a1 = new B();//auto upcasting
		B b1 = (B)a1;
		System.out.println("-------");
		A a2 = new A();//no casting at all
		B b2 = (B)a2;
		System.out.println("-------");
	}
}