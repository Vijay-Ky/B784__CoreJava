class Z5
{
	enum X
	{
		A, B, C, D;
	}
	public static void main(String[] args)
	{
		X x1 = X.C;
		switch(x1)
		{
			case A:
			{
				System.out.println("in A");
				break;
			}
			case B:
			{
				System.out.println("in B");
				break;
			}
			case C:
			{
				System.out.println("in C");
				break;
			}
		}
	}

}
/*
 1. in JDK 1.5 switch case has been improved which can take enum constant as
    an argument.
 2. if switch argument is an enum constant, then every case should be with
    the same enum constants.
*/
