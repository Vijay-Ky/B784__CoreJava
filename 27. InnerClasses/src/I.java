class I
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j = 10;
		class A
		{
			void test()
			{
				//System.out.println(i);
				System.out.println(j);
			}
		}
		i = 10;
		System.out.println("done");
	}
}
