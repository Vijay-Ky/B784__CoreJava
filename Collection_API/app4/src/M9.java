import java.util.HashSet;

class C
{
	int i, j, k;
	C(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public String toString()
	{
		return "(" + i + "," +  j + "," + k + ")";
	}
	public int hashCode()
	{
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		String s3 = Integer.toString(k);
		int hash = s1.hashCode();
		hash += s2.hashCode();
		hash += s3.hashCode();
		System.out.println("hashCode for " + this + "is " + hash);
		return hash;
	}
	public boolean equals(Object obj)
	{
		boolean b1 = (i == ((C)obj).i && j == ((C)obj).j && k == ((C)obj).k);
		System.out.println("equals b/w " + this + "	and " + obj + " is " + b1);
		return b1;
	}
}
public class M9 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println(set.add(new C(10, 20, 30)));
		System.out.println("------------------------");
		System.out.println(set.add(new C(10, 20, 30)));
		System.out.println("------------------------");
		System.out.println(set.add(new C(10, 20, 30)));
		System.out.println("------------------------");
		System.out.println(set.add(new C(20, 10, 30)));
		System.out.println("------------------------");
		System.out.println(set.add(new C(20, 10, 30)));
		System.out.println("------------------------");
		System.out.println(set.add(new C(20, 100, 30)));
		System.out.println("------------------------");
		System.out.println(set.add(new C(20, 100, 30)));
		System.out.println("------------------------");
		System.out.println(set.add(new C(100, 20, 300)));
		System.out.println("------------------------");
		System.out.println(set.add(new C(300, 100, 20)));
		System.out.println("------------------------");
		
		System.out.println(set);
	}
}
