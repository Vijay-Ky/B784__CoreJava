public class K
{
	public static void main(String[] args) 
	{
		System.out.println(1);
	    try
		{
			System.out.println(2);
			int i = 10 / 0;
			System.out.println(3);
		}
	    catch(ArithmeticException ex)//throwable
		{	
			System.out.println(4);
			System.out.println(ex.getMessage());
			System.out.println(5);
		}
		System.out.println(6);
	}
}
/*
ex.getMessage() - method of Throwable class used to return
a detailed message of the Throwable object which can also be null.
we use this method to get the detail message of exception as a string
value.
-returns detailed message of this Throwable instance
*/
