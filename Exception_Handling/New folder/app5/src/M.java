package com.lara;
public class M
{
	public static void main (String[] args)
	{
		System.out.println(1);
		try
		{
			test();
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("ex");
		}
		System.out.println(2);
	}
	static void test() throws ClassNotFoundException
	{
		System.out.println(3);
		Class.forName("");
		System.out.println(4);
	}
}