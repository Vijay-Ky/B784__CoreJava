class A
{
	static
	{
		System.out.println("SIB");
	}
}
class M5 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class c1 = Class.forName("A");
		System.out.println("done");
	}
}
