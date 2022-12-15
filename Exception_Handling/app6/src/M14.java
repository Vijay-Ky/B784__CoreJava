class M14 
{
	public static void main(String[] args) 
	{
		try
		{
			
		}
		catch (ClassNotFoundException ex)
		{
		}
		System.out.println("done");
	}
}
/* 
1. try cant be empty if catch is checked exception type.
we get CTE
M14.java:9: error: exception ClassNotFoundException is never thrown in body of corresponding try statement
                catch (ClassNotFoundException ex)
                ^
1 error
2. other than Class.forName("") we cant keep anything else.
*/

