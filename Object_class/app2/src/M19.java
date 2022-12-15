class P
{
	int i;
}
class Q
{
	int i;
	Q(int i)
	{
		this.i = i;
	}
}
class R 
{
	int i;
	R(int i)
	{
		this.i = i;
	}
	public boolean equals(Object obj)
	{
		//if only first operand returns true then only checks second
		return (obj instanceof R && this.i == ((R)obj).i);
		//return this.i == ((R)obj).i;
	}
}
class M19
{
	public static void main(String[] args) 
	{
		R r1 = new R(90);
		R r2 = new R(90);
		Q q1 = new Q(90);
	
		P p1 = new P();
		p1.i = 90;
	//we suppose to get exception but we get false bcz of instanceof operator
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(q1));
	//we suppose to get exception but we get false bcz of instanceof operator
		System.out.println(r1.equals(p1));
	//we suppose to get exception but we get false bcz of instanceof operator
		System.out.println(r1.equals(90));
	//we suppose to get exception but we get false bcz of instanceof operator
		System.out.println(r1.equals(90.0));
	}
}
