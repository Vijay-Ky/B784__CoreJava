class A
{
	int i;
}
class M11
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;

		A a2 = new A();
		a2.i = 10;

		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.i == a2.i);
	}
}
