class N 
{
	int i;
	N(int i)
	{
		this.i = i;
	}
	public boolean equals(Object obj)
	{
		N ref = (N) obj;//downcasting obj into N
		return i == ref.i;
	}
}
class M extends N 
{
	int i;
	M()
	{
		super(90);
	}
}
class M17 
{
	public static void main(String[] args) 
	{
		N n1 = new N(90);
		N n2 = new N(90);
	
		M m1 = new M();
		m1.i = 90;
		System.out.println(n1.equals(n2));
		//we get classcastexception bcz
		  //String,Integer,boolean are not subclass to N so we get Exception
		//CTS bcz equals method arg type is object type
		//class M is also subclass to object type
		//it automaticaly upcast
		System.out.println(n1.equals(m1));
		//can supply string
		//System.out.println(n1.equals("xyz"));
		//can supply any wrapper object
		//90 is boxing into Integer object
		//Integer object is upcasted into Object type
		//System.out.println(n1.equals(90));
		//System.out.println(n1.equals(true));
	}
}
