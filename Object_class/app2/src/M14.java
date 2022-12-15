class C
{
	int i;
	C(int i)
	{
		this.i = i;
	}

	public boolean equals(Object obj)
	{
		return (this.i == ((C)obj).i);
	}
}
class M14
{
	public static void main(String[] args) 
	{
		C c1 = new C(90);
		C c2 = new C(90);
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.i == c2.i);
	}
}
