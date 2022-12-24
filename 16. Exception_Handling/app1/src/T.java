class T 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			String s1 = null;
			int i = s1.length();//NPE
			System.out.println("try end");
		}
		catch (NullPointerException ex)
		{
			System.out.println("from catch");
			ex.printStackTrace();//1.which exception class, 2.program class, 3.method, 4.line
			System.out.println("catch end");
		}
		System.out.println("end of main");
	}
}
