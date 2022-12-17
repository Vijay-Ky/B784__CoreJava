class C 
{
	public static void main(String[] args) 
	{
		int[] a = {10, 20, 40};
		int[] b = {10, 20, 40};


		//only one loop is enough for addition of 2 single dim arrays 
		//only one row
		for(int i = 0; i < 3; i++)
		{
			System.out.println(a[i] + b[i]);
		}
	}
}
