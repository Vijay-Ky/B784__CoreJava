class Z1 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int[] x = new int[999999999];
			System.out.println(2);
		}
		catch (OutOfMemoryError ex)
		{
			System.out.println("from catch");
			ex.printStackTrace();
			System.out.println("catch end");
		}
		System.out.println("end of main");
	}
}
