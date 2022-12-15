package com.lara1;
public class D
{
	public static void main(String[] args)
	{
	System.out.println(1);
	if(true)
	{
		throw new NumberFormatException("some msg");
	}
		System.out.println(2);
	}
}