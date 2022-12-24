package com.lara;
import java.io.IOException;
import java.sql.SQLException;
public class Q
{
	static void test1() throws SQLException
	{
		
	}
	static void test2() throws IOException
	{
		
	}
	static void test3() throws NullPointerException
	{
		
	}
	static void test4()
	{
		try
		{
			test1();
		}
		catch(SQLException ex)
		{
		}
		try
		{
			test2();
		}
		catch(IOException ex)
		{
		}
		test3();
	}
	static void test5()
	{
		try
		{
			test1();
			test2();
		}
		catch(SQLException ex)
		{
		}
		catch(IOException ex)
		{
		}
	}
	static void test6() throws SQLException, IOException
	{
		test1();
		test2();
	}
	static void test7() throws Exception
	{
		test1();
		test2();
	}
	
	void test8() throws Throwable
	{
		test2();
		test1();
	}
	void test9()
	{
		try
		{
			test2();
			test1();
		}
		catch(Exception ex)
		{
		}
	}
}