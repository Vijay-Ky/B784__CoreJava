class A
{
	static
	{
		System.out.println("A-SIB");
	}
	A()
	{
		System.out.println("A()");
	}
	
	{
		System.out.println("A-IIB");
	}
}

class B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
	B()
	{
		System.out.println("B()");
	}	
	{
		System.out.println("B-IIB");
	}
}
class C extends B
{
	static
	{
		System.out.println("C-SIB");
	}
	C()
	{
		System.out.println("C()");
	}	
	{
		System.out.println("C-IIB");
	}
}
class Z6
{
	static
	{
		System.out.println("Z6-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C c1 = new C();
		System.out.println("-----------");
		B b1 = new B();
		System.out.println("-----------");
		A a1 = new A();
		System.out.println("main end");
	}
}
