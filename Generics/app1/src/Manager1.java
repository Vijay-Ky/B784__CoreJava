class B
{
	String s1;
	Integer i;
}
class Manager1
{
	public static void main(String [] args)
	{
		B b1 = new B();
		b1.s1 = "abc";
		b1.i = 20;
		B b2 = new B();
		b2.s1 = "xyz";
		b2.i = 40;
		System.out.println("done");
	}
}