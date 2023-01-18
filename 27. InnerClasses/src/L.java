interface K
{
	void test();
}
class L 
{
	public static void main(String[] args) 
	{
		K k1 = new K()
		{
			public void test()
			{
				System.out.println("from test inner class");
			}
		};
		k1.test();
		System.out.println("-----------");

		K k2 = () -> System.out.println("from test lamda expression");
		k2.test();
	}
}
