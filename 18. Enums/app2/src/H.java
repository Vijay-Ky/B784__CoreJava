class H 
{
	enum I
	{
		CON1(10), CON2(30), CON3(50);

		int i;

		I(int i)
		{
			this.i = i;
		}
	}
	public static void main(String[] args) 
	{
		I i1 = I.CON3;
		System.out.println(i1);
		System.out.println(i1.i);

		I i2 = I.CON2;
		System.out.println(i2);
		System.out.println(i2.i);
	}
}
