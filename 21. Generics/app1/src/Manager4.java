class D <Z>
{
	String s1;
	Z i;
}
class Manager4
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.s1 = "abc";
		d1.i = 10;
		System.out.println(d1.s1);
		System.out.println(d1.i);
	}
}
