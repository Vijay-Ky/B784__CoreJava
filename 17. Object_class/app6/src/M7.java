class A
{
	static
	{
		System.out.println("SIB");
	}
}
class M7
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		A a1 = new A();
		Class obj2 = Class.forName("A");
		Class c1 = a1.getClass();
		System.out.println(c1 == obj2);
		System.out.println(c1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println("done");
	}
}
