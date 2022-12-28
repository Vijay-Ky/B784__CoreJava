class A
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}
class M1
{
	public static void main(String[] args)
	{
		A a1 = new A(90);
		A a2 = new A(90);
		
		System.out.println("a1: " + a1.hashCode());
		System.out.println("a2: " + a2.hashCode());

		A a3 = a2;

		System.out.println("a3: " + a3.hashCode());
	}
}