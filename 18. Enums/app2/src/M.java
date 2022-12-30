class M 
{
	enum N
	{
		A, B, C, D;
	}

	public static void main(String[] args) 
	{
		N n1 = N.C;
		switch(n1)//JDK1.5
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
			case D:
			{
				System.out.println("in D");
				break;
			}
		}
	}
}
