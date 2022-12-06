class A
{
	A()
	{
		System.out.println("A()");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C()");
	}
}
class P extends C 
{
	P()
	{
		System.out.println("P()");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("---------");
		B b1 = new B();
		System.out.println("---------");
		C c1 = new C();
		System.out.println("---------");
		P p1 = new P();
		System.out.println("---------");
	}
}
