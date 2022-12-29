class O 
{
	public static void main(String[] args) 
	{
		Month m1 = Month.JAN;
		Month m2 = Month.DEC;

		System.out.println(m1);
		System.out.println(m2);

		System.out.println(m1.ordinal());
		System.out.println(m2.ordinal());

		int i = Month.FEB.ordinal();
		System.out.println(i);
	}
}
