class Z1
{
	enum C
	{
		T1, T2, T3, T4, T5;
		void test()
		{
			System.out.println("from test");
		}
	}
	public static void main(String[] args) 
	{
		C c1 = C.T3;
		c1.test();
		System.out.println("-------------");
		C c2 = C.T4;
		c2.test();
		System.out.println("-------------");
	}
}
/*
 1. all constants required no-arg constructor, and compiler keeps no-arg 
    constructor.
 */
