class K 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("try begin");
			String n = null;
			System.out.println(n.length());
			System.out.println("try end");
		}
		catch (NullPointerException ex)
		{
			System.out.println("catch begin");
			String n = null;
			System.out.println(n.length());
			System.out.println("Null Pointer Exception");
			System.out.println("catch end");
		}
		//whether exception is there or not
		//whether the raised exception gets hadled or not
		//once the control enters the try block compulsory finaly must execute
		finally
		{
			System.out.println("finally");
		}
		System.out.println("main end");
	}
}
