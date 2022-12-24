class M6
{
	public static void main(String[] args) //throws ArithmeticException
	{
		test1();
		System.out.println("done");
	}
	static void test1() //throws ArithmeticException
	{
		test2(); 
	}
	static void test2() throws ArithmeticException
	{
		int i = 10 / 0;//compiler doest care in case of unchecked exception 
	}
}
/* there is no need of keeping throws ArithmeticException but still we can keep*/