class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class B extends A
{
	B()
	{
		super(10);
		System.out.println("B()");
	}
	B(int i)
	{
		System.out.println("B(int)");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C()");
	}
	C(int i)
	{
		super(i);
		System.out.println("C(int)");
	}
}
class R extends C 
{
	R()
	{
		super(20);
		System.out.println("R()");
	}
	R(int i)
	{
		super(200);
		System.out.println("R(int)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("---------");
		B b1 = new B();
		System.out.println("---------");
		C c1 = new C();
		System.out.println("---------");
		R r1 = new R();
		System.out.println("---------");
		A a2 = new A(10);
		System.out.println("---------");
		B b2 = new B(10);
		System.out.println("---------");
		C c2 = new C(20);
		System.out.println("---------");
		R r2 = new R(30);
		System.out.println("---------");
	}
}
