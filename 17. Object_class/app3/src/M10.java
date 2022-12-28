//How hashset internally works? can you explain
import java.util.HashSet;
class E
{
	int i, j, k;

	E(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}

	public String toString()
	{
		return "(" + i + ", " + j + ", " + k + ")";
	}

	public boolean equals(Object obj)
	{
		E ref = (E)obj;
		boolean flag = (i == ref.i && j == ref.j && k == ref.k);

		System.out.println("========");
		System.out.println("equal b/w" + this + " and " + obj + " is: "
			+ flag);
		System.out.println("========");

		return flag;
	}

	public int hashCode()
	{
		int hash = Integer.toString(i).hashCode();
		hash += Integer.toString(j).hashCode();
		hash += Integer.toString(k).hashCode();
		System.out.println("########");
		System.out.println("hashCode of " + this + " is: " + hash);
		System.out.println("########");
		return hash;
	}
}
class M10 
{
	public static void main(String[] args) 
	{
		E e1 = new E(900, 100, 500);
		E e2 = new E(900, 100, 500);

		E e3 = new E(100, 100, 900);
		E e4 = new E(100, 100, 900);

		E e5 = new E(900, 500, 100);
		E e6 = new E(900, 500, 100);

		E e7 = new E(900, 700, 800);

		E e8 = new E(900, 800, 700);

		E e9 = new E(700, 900, 800);

		E e10 = new E(1900, 1100, 1500);

		HashSet<E> set = new HashSet<E>();

		set.add(e1);
		System.out.println("--11--");

		set.add(e2);
		System.out.println("--12--");

		set.add(e3);
		System.out.println("--13--");

		set.add(e4);
		System.out.println("--14--");

		set.add(e5);
		System.out.println("--15--");

		set.add(e6);
		System.out.println("--16--");

		set.add(e7);
		System.out.println("--17--");

		set.add(e8);
		System.out.println("--18--");

		set.add(e9);
		System.out.println("--19--");

		set.add(e10);
		System.out.println("--20--");

		System.out.println(set);
	}
}
