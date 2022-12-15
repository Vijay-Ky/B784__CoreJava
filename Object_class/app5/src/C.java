class C
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		C c1 = new C();
		System.out.println("1");
		C c2 = (C) c1.clone();//downcasting return value of clone method to C type 
		System.out.println("2");
		System.out.println("done");
	}
}