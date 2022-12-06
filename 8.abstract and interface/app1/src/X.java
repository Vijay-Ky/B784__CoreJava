abstract class X 
{
	X(int i)
	{
		System.out.println("X(int)");
	}
	abstract void test1();
}
abstract class Y extends X
{
	Y()
	{
		super(90);
		System.out.println("Y()");
	}
}
class Z extends Y
{
	Z()
	{
		System.out.println("Z()");
	}
	void test1()
	{
		System.out.println("test1");
	}
	public static void main(String[]args)
	{
		Z obj1 = new Z();
		System.out.println("-----");
		obj1.test1();
		System.out.println("done");
	}
}