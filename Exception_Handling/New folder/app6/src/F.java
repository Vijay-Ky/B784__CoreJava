package com.lara1;
public class F
{
	public static void main(String[] args)
	throws ClassNotFoundException
	{
	System.out.println(1);
	if(true)
	{
		throw new ClassNotFoundException();
	}
		System.out.println(2);
	}
}