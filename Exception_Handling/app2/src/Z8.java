class Z8
{
	public static void main(String[] args) 
	{
		System.out.println("main begin!");
		try
		{
			System.out.println("try begin");
			int i = 10 / 0;
			System.out.println("try  end");
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
/*can keep try without a catch block but finally along with try is manadatory.
possible syntax
try-catch
try-catch-finally
try-catches
try-catches-finally
try-finally
*/