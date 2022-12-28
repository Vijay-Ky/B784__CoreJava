class E
{
	int i;
	int j;
	double k;

	E(int i, int j, double k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}

	public boolean equals(Object obj)
	{
		E ref = (E)obj;
		//boolean flag = (this.i == ref.i && this.j == ref.j &&
			            //this.k == ref.k);
		//return flag;
		return this.i == ref.i && this.j == ref.j &&
			            this.k == ref.k;
	}
}
class M13
{
	public static void main(String[] args)
	{
		E e1 = new E(10, 20, 4.0);
		E e2 = new E(10, 20, 4.0);

		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));

		System.out.println(e1.i == e2.i && e1.j == e2.j &&
			               e1.k == e2.k);

		E e3 = e2;

		System.out.println(e3 == e2);
		System.out.println(e3.equals(e2));

		System.out.println(e3.i == e2.i && e3.j == e2.j &&
			               e3.k == e2.k);
	}
}