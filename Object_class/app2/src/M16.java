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
		boolean flag = (i == ref.i && j == ref.j && k == ref.k);
		return flag;
	}
}
class M16
{
	public static void main(String[] args) 
	{
		E e1 = new E(10, 20, 5.8);
		E e2 = new E(10, 20, 5.5);
		E e3 = new E(10, 20, 5.9);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e3));
	}
}
