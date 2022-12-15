class Z2
{
	enum D
	{
		CON(10), CON1(90), CON2(80);
		int i;
		D(int i)
		{
			this.i = i;
		}
		int test1()
		{
			return i;
		}
	}
	public static void main(String[] args) 
	{
		D d1 = D.CON2;
		System.out.println(d1);
		System.out.println(d1.i);
		System.out.println(d1.test1());
		D d2 = D.CON1;
		System.out.println(d2);
		System.out.println(d2.i);
		System.out.println(d2.test1());
	}
}
