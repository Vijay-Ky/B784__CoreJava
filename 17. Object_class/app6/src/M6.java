class A
{
	static
	{
		System.out.println("SIB");
	}
}
class M6
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		A a1 = new A();
		Class c1 = Class.forName("A");
		System.out.println("done");
	}
}
