class A
{
	A()
	{
		System.out.println("A()");
	}
	
	{
		System.out.println("A-IIB");
	}
}

class V  
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("----------");
		A a2 = new A();
	}
}
