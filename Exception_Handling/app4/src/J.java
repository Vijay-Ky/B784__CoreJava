/*
Error and RuntimeException both comes under unchecked. remaining all are checked.
Throwable and Exception are comes under semi-checked.

*/
public class J
{
	public static void main(String[] args) 
	{
		System.out.println(1);
	    try
		{
			int i = 10 / 0;
		}
	    catch(ArithmeticException ex)
		{
			System.out.println(2);
			System.out.println(ex);
			System.out.println(3);
		}
		System.out.println(4);
	}
}