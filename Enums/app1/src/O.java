class O
{
	public static void main(String[] args)
	{
		Month t1 = Month.JAN;
		Month t2 = Month.DEC;
		
		System.out.println(t1);
		System.out.println(t2);
		//we can find out the order in enum Month
		System.out.println(t1.ordinal());
		System.out.println(t2.ordinal());
		
		int i = Month.FEB.ordinal();
		System.out.println(i);
	}
}
//every enum constant will be having unique index value.
  //we can find out that by ordinal()

//ordinal() method is used for identifying order of the constant(index of the constant)