public class F
{
	public static void main(String []args)
	{
		int x[] = new int[4];
		System.out.println(x.length);	

		System.out.println("------");

		for(int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("------");

		for(Integer i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}

		System.out.println("------");

		for(Integer i : x)
		{
			System.out.println(i);
		}

		System.out.println("------");

		for(int i : x)
		{
			System.out.println(i);
		}

		System.out.println("------");

		System.out.println("from while");
		int i = 0;
		while(i < 4 )
		{
			System.out.println(x[i]);
			i++;
		}

	}
}
