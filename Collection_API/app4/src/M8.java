import java.util.HashSet;

class B
{
	int i, j;
	B(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public String toString()
	{
		return "(i = " + i + "," + "j = " + j + ")";
	}
	public int hashCode()
	{
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int hash = s1.hashCode();
		hash += s2.hashCode();
		return hash;
	}
	public boolean equals(Object obj)
	{
		return i == ((B)obj).i && j == ((B)obj).j;
	}
}
public class M8 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println(set.add(new B(90, 10)));
		System.out.println(set.add(new B(90, 10)));
		System.out.println(set.add(new B(90, 10)));
		System.out.println(set.add(new B(90, 10)));
		System.out.println(set.add(new B(90, 11)));
		System.out.println(set.add(new B(90, 11)));
		System.out.println(set.add(new B(91, 10)));
		System.out.println(set.add(new B(91, 10)));
		System.out.println(set.add(new B(91, 10)));
		System.out.println(set.add(new B(10, 91)));
		
		System.out.println(set);
	}
}
