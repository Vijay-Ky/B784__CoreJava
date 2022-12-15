//Developing our own Exception class
public class AgeIsNegativeException extends Throwable
{
	public AgeIsNegativeException(String msg)
	{
		super(msg);//supplying msg to super class constructor
	}
}
/*
- designing a subclass to Throwable type 
- for every abnormal condition try to develop our own Exception class
- if we dont provide these two constructors compiler will generate no-arg
  constructor
*/