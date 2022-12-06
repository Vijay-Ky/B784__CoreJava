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
	
	{
		System.out.println("A-IIB");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B()");
	}
	B(int i)
	{
		this();
		System.out.println("B(int)");
	}
	
	{
		System.out.println("B-IIB1");
	}

	{
		System.out.println("B-IIB2");
		System.out.println("B-IIB2");
		System.out.println("B-IIB2");
	}
}

class X  
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("----------");
		A a2 = new A();
		System.out.println("----------");
		B b1 = new B();
		System.out.println("----------");
		B b2 = new B();
		System.out.println("----------");
		A a3 = new A(20);
		System.out.println("----------");
		A a4 = new A(30);
		System.out.println("----------");
		B b3 = new B(40);
		System.out.println("----------");
		B b4 = new B(60);
	}
}
