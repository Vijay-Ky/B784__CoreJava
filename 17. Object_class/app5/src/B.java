class B 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		B b1 = new B();
		B b2 = (B)b1.clone();
		System.out.println(b1);
		System.out.println(b2);
	}
}
