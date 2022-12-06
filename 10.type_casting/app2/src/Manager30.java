class Manager30
{
	public static void main(String[] args)
	{
		A a1 = new C();
		if(a1 instanceof A)	
		{
			System.out.println("to A");
			A a2 = (A)a1;
			if(a1 instanceof B)
			{
				System.out.println("to B");
				B b2 = (B)a1;
			}
			if(a1 instanceof C)
			{
				System.out.println("to C");
				C c2 = (C)a1;
			}
			if(a1 instanceof D)
			{
				System.out.println("to D");
				D d2 = (D)a1;
			}
		}
	}
}