class A
{
	static
	{
		System.out.println("A-SIB");
	}
}

class B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
}
class C extends B
{
	static
	{
		System.out.println("C-SIB");
	}
}
class Z extends C
{
	static
	{
		System.out.println("Z-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}
