
package com.lara1;
public class C
{
	int test1() 
	{
		try
		{
			//some stmts
		}
		catch(NullPointerException ex)
		{
			
		}
		catch(ArithmeticException ex)
		{
			
		}
		return 20;
	}	
	int test2() 
	{
		try
		{
			//some stmts
			return 10;
		}
		catch(NullPointerException ex)
		{
			return 20;
		}
		catch(ArithmeticException ex)
		{
			return 30;
		}
	}
	//int test3() 
	//{
	//	try
	//	{
	//	//some stmts
	//	}
	//	catch(NullPointerException ex)
	//	{
	//		return 20;
	//	}
	//	catch(ArithmeticException ex)
	//	{
	//		return 30;
	//	}
	//}
	int test4() 
	{
		try
		{
			//some stmts
		}
		catch(NullPointerException ex)
		{
			return 20;
		}
		catch(ArithmeticException ex)
		{
			return 30;
		}
		return 300;
	}
	//int test5() 
	//{
	//	try
	//	{
	//		//some stmts
	//		return 10;
	//	}
	//	catch(NullPointerException ex)
	//	{
	//	}
	//	catch(ArithmeticException ex)
	//	{
	//		return 30;
	//	}
	//}
	int test6() 
	{
		try
		{
			//some stmts
		}
		catch(NullPointerException ex)
		{
		}
		catch(ArithmeticException ex)
		{
			return 30;
		}
		return 1000;
	}
	//int test7() 
	//{
	//	try
	//	{
	//		//some stmts
	//		return 30;
	//	}
	//	catch(NullPointerException ex)
	//	{
	//		return 40;
	//	}
	//	catch(ArithmeticException ex)
	//	{
	//		return 50;
	//	}
	//	return 70;
	//}
}	