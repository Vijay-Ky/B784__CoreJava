package com.lara1;
public class B
{
	int test(String s1) 
	{
		try
		{
			//some stmts
		}
		catch(NumberFormatException ex)
		{
			
		}
		return 20;
	}	
	int test1(String s1) 
	{
		try
		{
			//some stmts
			return 1;
		}
		catch(NumberFormatException ex)
		{
			return 0;
		}
	}	
	//int test2(String s1) 
	//{
	//	try
	//	{
	//		//some stmts
	//	}
	//	catch(NumberFormatException ex)
	//	{
	//	return 0;	
	//	}
	//}	
	int test3(String s1) 
	{
		try
		{
			//some stmts
		}
		catch(NumberFormatException ex)
		{
			return 0;
		}
		return 500;
	}	
	//int test4(String s1) 
	//{
	//	try
	//{
	//		//some stmts
	//		return 20;
	//	}
	//	catch(NumberFormatException ex)
	//	{
	//		
	//	}
	//}	
	int test5(String s1) 
	{
		try
		{
			//some stmts
			return 20;
		}
		catch(NumberFormatException ex)
		{
			
		}
		return 30;
	}	
	//int test6(String s1) 
	//{
	//	try
	//	{
	//		//some stmts
	//		return 20;
	//	}
	//	catch(NumberFormatException ex)
	//	{
	//		return 0;
	//	}
	//	return 30;
	//}
}	