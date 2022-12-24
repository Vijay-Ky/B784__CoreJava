class A
{
	A() throws ClassNotFoundException
	{
		Class.forName("");	
	}
}
class M20 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		A a1 = new A();
		System.out.println("done");
	}
}
