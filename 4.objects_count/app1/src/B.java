class B 
{
	static int p = 10;
	public static void main(String[] args) 
	{
		System.out.println("a: " + p);
		System.out.println("b: " + B.p);
		B obj = new B();
		//compiler replacing from reference variable to class name
		//can use reference of same class type
		System.out.println("c: " + obj.p);
		
	}
}
