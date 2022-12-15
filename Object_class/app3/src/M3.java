class C
{
	int i;

	C()
	{
		this.i = i;
	}
	public int hashCode()
	{
		return i;
	}
}
class M3 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.i = 10;
		
		C c2 = new C();
		c2.i = 10;

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}
/*
overriding
hashcode method based on content it is returning int value.
*/