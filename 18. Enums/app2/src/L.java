class L 
{
	enum M
	{
		T1, T2,
		T3//constant specific class body(CSCB)
		{
			void method()
			{
				System.out.println("method1() for T3");
			}
		}, T4, T5;

		void method()
		{
			System.out.println("General method2()");
		}
	}
	public static void main(String[] args) 
	{
		M m1 = M.T1;
		M m2 = M.T2;
		M m3 = M.T3;
		M m4 = M.T4;
		M m5 = M.T5;

		m1.method();
		m2.method();
		m3.method();
		m4.method();
		m5.method();
	}
}
