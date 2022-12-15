class H
{
	int i, j, k;
	H(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public boolean equals(Object obj)
	{
		//if only first operand returns true then only checks second
		return (obj instanceof H) &&
			    i == ((H)obj).i &&
			    j == ((H)obj).j &&
			    k == ((H)obj).k;
	}
}
class M20
{
	public static void main(String[] args) 
	{
		H h1 = new H(10, 20, 30);
		H h2 = new H(10, 20, 30);
	
		System.out.println(h1.equals(h2));
		System.out.println(h1.equals(10));
		System.out.println(h1.equals(new H(10, 20, 30)));
		System.out.println(h1.equals(new H(10, 20, 31)));
		System.out.println(h1.equals("hello"));
	}
}
/*
it will check whether the object type is H type or not
*/
