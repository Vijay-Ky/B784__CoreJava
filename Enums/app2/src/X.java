class X
{
	enum A
	{
		CON(100), TEST(200);
		A(int i)
		{
			System.out.println("A(int): " + i);
		}
	}
	public static void main(String[] args)
	{
		A a1 = A.TEST;
		System.out.println(a1);
	}
}
/*
1. here argument constructor is mandatory, bcz every construtor
   taking one argument.
2. enum constants can take arguments.
3. first CON is loading even though we are not using CON.
4. while loading CON 100 is assigning to i and prints 100
   while loading TEST 200 is assigning to i and prints 200
5. ";" is mandatory after list of constants bcz of constructor.
*/