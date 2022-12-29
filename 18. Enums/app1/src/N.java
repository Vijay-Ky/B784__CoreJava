class N 
{
	public static void main(String[] args) 
	{
		Month[] all1 = Month.values();

		for(Month all2 : all1)
		{
			System.out.println(all2);
		}
		System.out.println("-------------------");
		for(Month all3 : Month.values())
		{
			System.out.println(all3);
		}
		System.out.println("-------------------");
		for(int i = 0; i < all1.length; i++)
		{
			System.out.println(all1[i]);
		}
	}
}
