class C 
{
	static int count;
	C()
	{
		count++;
	}
	public static void main(String[] args) 
	{
		C obj1 = new C();
		System.out.println("a: " + count);
		C obj2 = new C();
		System.out.println("b: " + count);
		C obj3 = new C();
		System.out.println("c: " + count);
		C obj4 = new C();
		System.out.println("d: " + count);
		C obj5 = new C();
		System.out.println("e: " + count);
	}
}
