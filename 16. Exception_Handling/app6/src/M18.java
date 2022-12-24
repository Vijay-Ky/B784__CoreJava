class M18 
{
	public static void main(String[] args) throws ClassNotFoundException//, ArithmeticException
	{
		test1();//requires try catch or throws while calling test1()
		test2();//not require any try catch or throws
		System.out.println("done");
	}
	static void test1() throws ClassNotFoundException
	{
		//can be empty in case of methods bt not in case of try
	}
	static void test2() //throws ArithmeticException
	{
	}
}
/*
1. method can throw ClassNotFoundException and ArithmeticExeption
even though that method is empty.
2. try cant be empty if catch is checked but method can be empty
*/
