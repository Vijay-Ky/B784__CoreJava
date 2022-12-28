class C
{
	int i;
	double j;
	boolean k;
	char c;

	C(int i, double j, boolean k, char c)
	{
		this.i = i;
		this.j = j;
		this.k = k;
		this.c = c;
	}

	public boolean equals(Object obj)
	{
		return (this.i == ((C)obj).i && this.j == ((C)obj).j && 
			    this.k == ((C)obj).k && this.c == ((C)obj).c);
	}
}
class M12
{
	public static void main(String[] args)
	{
		C c1 = new C(10, 2.5, true, 'a');
		C c2 = new C(20, 2.5, true, 'a');

		System.out.println(c1 == c2);//false
		System.out.println(c1.equals(c2));

		System.out.println(c1.i == c2.i && c1.j == c2.j &&
			               c1.k == c2.k && c1.c == c2.c);
		
		C c3 = c2;

		System.out.println(c3 == c2);//true
		System.out.println(c3.equals(c2));

		System.out.println(c3.i == c2.i && c3.j == c2.j &&
			               c3.k == c2.k && c3.c == c3.c);
	}	   
}