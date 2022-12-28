class I
{
	int x;//primitive
	String s1;//non-primitive

	public boolean equals(Object obj)
	{
		return (obj instanceof I) && (x == ((I)obj).x) &&
			                         (s1.equals(((I)obj).s1));
	}
}
class M24
{
	public static void main(String[] args)
	{
		I obj1 = new I();
		obj1.x = 10;
		obj1.s1 = "hello";

		I obj2 = new I();
		obj2.x = 10;
		obj2.s1 = "hello";

		System.out.println(obj1.equals(obj2));

		I obj3 = new I();
		obj3.x = 10;

		System.out.println(obj2.equals(obj3));

		I obj4 = new I();

		System.out.println(obj4.equals(obj1));

		I obj5 = new I();
		obj5.x = 10;

		System.out.println(obj5.equals(obj2));
	}
}