class I
{
	int x;//primitive
	String s1;//non-primitive

	public boolean equals(Object obj)
	{
		I ref = (I)obj;
		boolean flag = (obj instanceof I) &&
			           (x == ref.x) && 
			           (s1 == null ?
			           (ref.s1 == null ? true : false) :
					   (ref.s1 == null ? false : s1.equals(ref.s1)));
		return flag;
	}
}
class M25
{
	public static void main(String[] args)
	{
		I obj1 = new I();
		obj1.x = 10;
		obj1.s1 = "hello";
		//obj1.s1 = "ello";

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