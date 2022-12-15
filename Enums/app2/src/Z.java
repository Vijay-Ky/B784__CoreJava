class Z
{
	enum B
	{
		CON1(10), CON2(30), CON4(50);
		int i;//its part of CON1, CON2, CON4
		B(int i)
		{
			this.i = i;
		}
	}
	public static void main(String[] args)
	{
		B b1 = B.CON4;
		System.out.println(b1);
		System.out.println(b1.i);//b1 pointing CON4 and that internally has copy of i
		B b2 = B.CON2;
		System.out.println(b2);
		System.out.println(b2.i);
	}
}