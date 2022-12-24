package com.lara1;
import java.io.Fi
leWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
public class E
{
	void test1()
	{
		System.out.println(1);
		int i=10/0;
		System.out.println(2);
	}
	void test2()
	{
		System.out.println(1);
		try
		{
			//whenever every catch is unchecked, try can be empty.
		}
		catch(ArithmeticException ex)
		{
			
		}
		System.out.println(2);
	}
	void test3()
	{
		System.out.println(1);
		int i= Integer.parseInt("abc");
		System.out.println(2);
	}
	void test4()
	{
		System.out.println(1);
		try
		{
			
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex);
		}
		System.out.println(2);
	}
	void tes5()
	{
		System.out.println(1);
		String s1=null;
		s1.length();
		System.out.println(2);
	}
	void test6()
	{
		System.out.println(1);
		try
		{
			
		}
		catch(NullPointerException ex)
		{
			
		}
		System.out.println(2);	
	}
	void test7()
	{
		Object obj=new Object();
		E e1=(E)obj;
	}
	void test8()
	{
		test8();
	}
	void test9()
	{
		try
		{
			
		}
		catch(StackOverflowError ex)
		{
			
		}
	}
	void test10()
	{
		int x[]=new int[999999999];
	}
	void test11()
	{
		try
		{
			
		}
		catch(NoClassDefFoundError ex)
		{
			System.out.println(ex);
		}
	}
	//void test12() checked exception ,try catch required 
	//{
	//	Class.forName("");
	//}
	void test13() //checked exception ,try catch required 
	{
		try
		{
			Class.forName("");
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
	//void test14() checked exception
	//{
	//	try
	//	{
	//		Class.forName("")'
	//	}
	//	catch(NullPointerException ex) unchecked exception catch 
	//	{
	//		ex.printStackTrace();
	//	}
	//}
	//void test15()
	//{
	//	try
	//	{
	//	}
	//	catch(ClassNotFoundException ex)
	//	{
	//		
	//	}
	//}
	//void test16()
	//{
	//	try
	//	{
	//		System.out.println("done");
	//	}
	//	catch(ClassNotFoundException ex)
	//	{
	//	}
	//}
	void test17()
	{
		try
		{
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
		}
		catch(ClassNotFoundException ex)
		{
		}
	}
	//void test18() jdbc stmt required try catch
	//{
	//	DriverManager.getConnection("");
	//}
	void test18()
	{
		try
		{
			DriverManager.getConnection("");
		}
		catch(SQLException ex)
		{
			
		}
	}
//	void test19()
//	{
//		try
//		{
//			
//		}
//		catch(SQLException ex)
//		{
//			
//		}
//	}
//	void test20()
	//{
	//	try
	//	{
	//		
	//	}
	//	catch(SQLException ex)
	//	{
	//		
	//	}
//	}
	void test21()
	{
		try
		{
			Class.forName("");
			DriverManager.getConnection("");
		}
		catch(SQLException ex)
		{
			
		}
		catch(ClassNotFoundException ex)
		{
			
		}
	}
	//void test22()
	//{
	//	new FileWriter("");
	//}
	void test23()
	{
		try
		{
			new FileWriter("");
		}
		catch(IOException ex)
		{
			
		}
	}
//	void test24()
//	{
//		try
//		{
//			
//		}
//		catch(IOException ex)
//		{
//			
//		}
//	}
//	void test25()
//	{
//		clone();
//	}
	void test26()
	{
		try
		{
			clone();
		}
		catch(CloneNotSupportedException ex)
		{
			
		}
	}
//	void test27()
//	{
//		try
//		{
//			
//		}
//		catch(CloneNotSupportedException ex)
//		{
//			ex.printStackTrace();
//		}
//	}
//	void test28()
//	{
//		Thread.sleep(1000);
//	}
	void test29()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			
		}
	}
//	void test30()
//	{
//		try
//		{
//		}
//		catch(InterruptedException ex)
//		{
//			
//		}
//	}
//	void test31()
//	{
//		DateFormat df= DateFormat.getDateinstance();
//		df.parse("");
//	}
	void test32()
	{
		DateFormat df= DateFormat.getDateinstance();
		try
		{
			df.parse("");
		}
		catch(ParseException ex)
		{
			ex.printStackTrace();
		}
	}
//	void test33()
//	{
//		try
//		{
//			
//		}
//		catch(ParseException ex)
//		{
//			
//		}
//	}
}