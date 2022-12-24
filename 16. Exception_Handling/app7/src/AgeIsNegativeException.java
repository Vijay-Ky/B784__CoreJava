//Developing our own Exception class
class AgeIsNegativeException extends Throwable//always should be subclass to Throwable
{
	public AgeIsNegativeException(String msg)
	{
		super(msg);//supplying msg to super class constructor
	}
}
/*
how to create our own exception class?or customized exception class?
- designing a subclass to Throwable type 
- for every abnormal condition try to develop our own Exception class
- if we dont provide these two constructors compiler will generate no-arg
  constructor
*/