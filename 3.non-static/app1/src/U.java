class U
{
	int i;
	static U test()
	{
		U u1 = new U();
		u1.i = 20;
		return u1; 
	}
	public static void main(String[] args)
	{
		U obj = test();
		System.out.println(obj.i);
	}
}