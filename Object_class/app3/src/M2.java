class B
{
	int i;
	int j;
	B(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
}
class M2 
{
	public static void main(String[] args) 
	{
		B b1 = new B(90, 10);
		B b2 = new B(90, 10);
		B b3 = b2;
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());

	}
}
/*
b3 and b2 are
pointing to the same object. we dont want memory address
always try to do something based on the content or
state(attribute values). we can override hashCode method.
*/