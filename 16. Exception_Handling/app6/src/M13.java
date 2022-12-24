class M13 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(1000);//this statement doesnt require a try catch	
		}
		catch (ArithmeticException ex)
		{
		}
		System.out.println("done");
	}
}
/* 
1. try can be empty if catch is unchecked.
compiler doesnt bother about unchecked exception.
*/

