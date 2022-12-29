class J 
{
	enum K
	{
		T1, T2, T3, T4, T5;

		void test()
		{
			System.out.println("from test");
		}
	}
	public static void main(String[] args) 
	{
		K k1 = K.T3;
		k1.test();
		System.out.println("---------");
		K k2 = K.T4;
		k2.test();
		System.out.println("---------");
	}
}
