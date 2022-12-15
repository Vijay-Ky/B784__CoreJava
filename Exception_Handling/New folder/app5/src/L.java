package com.lara;
public class L
{
	public static void main (String[] args)
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}
	static void test()
	{
		System.out.println(3);
		try
		{
		Class.forName("");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("ex");
		}
		System.out.println(4);
	}
}