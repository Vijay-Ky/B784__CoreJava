//throw
class M1
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if(true)
		{
			throw new ArithmeticException();//this is without the message
		}
		System.out.println(2);
	}
}
/*
1. throw keyword is used for raising Exception or Error Object explicitely.
2. we can specify any Exception or Error class name along with the throw.
3. if we did not handled the raised exception flow will be terminating abnoramaly.
*/