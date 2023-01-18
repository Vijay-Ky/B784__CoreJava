interface M
{
	void test(int i);
}
class N 
{
	public static void main(String[] args) 
	{
		M m1 = new M()
		{
			public void test(int i)
			{
				System.out.println("from test inner class");
			}
		};
		m1.test(10);
		System.out.println("-----------");

		M m2 = (int x) -> System.out.println("from test lamda expression");
		m2.test(20);
	}
}
