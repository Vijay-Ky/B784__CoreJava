class M3
{
	public static void main(String[] args) 
	{
		System.out.println("begin");
		try
		{
			test();
		}
		catch (ClassNotFoundException ex)
		{
		}
		System.out.println("end");
	}
	static void test() throws ClassNotFoundException
	{
		Class.forName("");	
		/*try
		{
			Class.forName("");	
		}
		catch (ClassNotFoundException ex)
		{
		}*/
		//dont look for try-catch for this statement look for the try-catch while calling test() method.
	}
}
/* Throws keyword only for checked exceptions, to avoid including try-catch
if we dont want try-catch we can specify it with throws
*/
