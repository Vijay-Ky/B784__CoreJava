import java.util.HashSet;

class E
{
	int i;
	E(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		System.out.println("----------------from toString-----------------------");
		
		return "address: " + super.hashCode() + " and state: (" + i + ")"+"from the return of toString method";
	}
	
	public int hashCode()
	{
		System.out.println("-------------start hashcode--------------------------");
		int hash = Integer.toString(i).hashCode();
		System.out.println("hashCode for " + this + "is " + hash);
		System.out.println("--------------end hashcode-------------------------");
		return hash;
	}
	public boolean equals(Object obj)
	{
		System.out.println("--------------start equals-------------------------");
		boolean b1 = (i == ((E)obj).i); 
		System.out.println("equals b/w " + this + "	and " + obj + " is " + b1);
		System.out.println("----------------end equals-----------------------");
		return b1;
	}
}

class M11 
{
	public static void main(String[] args) 
	{
		E e1 = new E(90);
		E e2 = new E(90);
		HashSet set = new HashSet();
		System.out.println("adding status of " + e1  + " is :" + set.add(e1));
		System.out.println("---------------------------------------------");
		System.out.println("adding status of " + e2 + " is :" + set.add(e2));
		System.out.println(set);
	}
}
