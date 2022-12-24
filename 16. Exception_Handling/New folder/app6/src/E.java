package com.lara1;
public class E
{
	public static void main(String[] args)
	{
	System.out.println(1);
	if(true)
	{
		throw new OutOfMemoryError("some message");
	}
		System.out.println(2);
	}
}