class E
{
	int i;

	public String toString()
	{
		return "i value: " + i;
	}
}
class M3
{
	public static void main(String[] args)
	{
		E e1 = new E();
		e1.i = 10;
		E e2 = new E();
		e2.i = 20;

		System.out.println(e1);
		System.out.println(e2);
	}
}