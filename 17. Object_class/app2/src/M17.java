class A
{
	int i;
	public boolean equals(Object obj)
	{
		if(!(obj instanceof F))
		{
			return false;
		}
		F ref = (F)obj;
		boolean flag = (this.i == ref.i);
		return flag;
	}
}
class F
{
	int i;

	F(int i)
	{
		this.i = i;
	}
	
	public boolean equals(Object obj)
	{
		return (obj instanceof A && this.i == ((A)obj).i);
	}
}
class M17
{
	public static void main(String[] arg)
	{
		F f1 = new F(90);
		F f2 = new F(90);

		System.out.println(f1 == f2);
		System.out.println(f1.equals(f2));

		System.out.println(f1.i == f2.i);

		F f3 = f2;

		System.out.println(f3 == f2);
		System.out.println(f3.equals(f2));

		System.out.println(f3.i == f2.i);

		A a1 = new A();
		a1.i = 90;

		System.out.println(a1.i == f1.i);

		System.out.println(a1.equals(f1));
		System.out.println(f1.equals(a1));


		System.out.println("----------------");

		System.out.println(f1.equals("abc"));
		System.out.println(f1.equals(true));


	}	
}