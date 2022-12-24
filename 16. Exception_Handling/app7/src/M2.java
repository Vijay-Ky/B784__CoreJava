//throw
class M2
{
	public static void main(String[] args) //throws String//must be Throwable or subclass to Throwable
	{
		System.out.println(1);
		if(true)
		{
			throw new ArithmeticException("some message why do we want to terminate the flow");	
		}
		System.out.println(2);
		/*
		try
		{
			
		}
		catch (String ex)//catch argument should be always throwable type
		{
		}*/
	}
}
/*
1. throw statements should be last statement in the current block
Three important points
1. catch argument should be always throwable type
    it can be throwable or subclass to throwable
2. throws keyword only required throwable type of class
	it can be throwable or subclass to throwable
*/