class Manager5
{
	public static void main(String[] args)
	{
		A a1 = new B();//A a1 = (A) new B() -auto upcasting
		B b1 = new C();
		C c1 = new D();
		Object o1 = new A();
		System.out.println("done");
	}
}