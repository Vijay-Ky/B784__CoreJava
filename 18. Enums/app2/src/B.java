enum A
{
	C1, C2, C3;
	
	A()
	{
		System.out.println("V()");
	}
}
class B 
{
	public static void main(String[] args) 
	{
		A a1 = A.C3;
		System.out.println(a1);
	}
}
