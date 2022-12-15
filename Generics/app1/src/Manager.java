class A
{
	int i;
}
class Manager
{
	public static void main(String [] args)
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
		a1.i = 10;
		a2.i = 20;
		a3.i = 30;
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
	}
}