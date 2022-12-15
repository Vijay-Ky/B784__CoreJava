package com.lara;
public class AgeIsNegativeException extends ArithmeticException  
{
	public AgeIsNegativeException()
	{
		
	}
	public AgeIsNegativeException(String msg)
	{
		super(msg);
	}
}