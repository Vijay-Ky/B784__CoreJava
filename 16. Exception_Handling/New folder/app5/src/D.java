
package com.lara1;
public class D
{
	int test1() 
	{
		try
		{
			//some stmts
		}
		catch(ArithmeticException ex)
		{
			
		}
		finally 
		{
		}
		return 10;
	}	
	int test2() 
	{
		try
		{
			//some stmts
		}
		catch(ArithmeticException ex)
		{
		}
		finally 
		{
		return 30;
		}
	}
	//int test3() 
	//{
	//	try
	//	{
	//		//some stmts
	//	}
	//	catch(ArithmeticException ex)
	//	{
	//	}
	//	finally 
	//	{
	//		return 30;
	//	}
	//	return 40; //unreachable stmts
	//}
	int test4() 
	{
		try
		{
			//some stmts
		}
		catch(ArithmeticException ex)
		{
			return 40;
		}
		finally 
		{
		}
		return 40;
	}
	//int test5() 
	//{
	//	try
	//	{
	//		//some stmts
	//		return 20;
	//	}
	//	
	//	catch(ArithmeticException ex)
	//	{
	//		return 30;
	//	}
	//	finally 
	//	{
	//	}
	//	return 40;
	//}
	//int test6() 
	//{
	//	try
	//	{
	//		//some stmts
	//		return 40;
	//	}
	//	catch(ArithmeticException ex)
	//	{
	//		return 30;
	//	}
	//	finally 
	//	{
	//		return 40;
	//	}
	//	return 50;
	//}
}	