class Manager3
{
	public static void main(String[] args)
	{
		Object obj1 = null;
		Object obj2 = null;
		obj1 = obj2;
		A a1 = null;
		A a2 = null;
		a1 = a2;
		B b1 = null;
		B b2 = null;
		b2 = b1;
		C c1 = null;
		C c2 = null;
		c1 = c2;
		D d1 = null;
		D d2 = null;
		d2 = d1;
		a2 = new A();
		obj1 = new Object();
		c1 = new C();
		d1 = d2;
		d2 = new D();
		b1 = new B();
		System.out.println("done");
	}
}