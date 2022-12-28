class A 
{
	int i;
	public boolean equals(Object obj)
	{
		F ref = (F)obj;
		boolean flag = (this.i == ref.i);
		return flag;
	}
}
class F
{
	int i;
	
	F(int i)
	{
		this.i = i;
	}

	public boolean equals(Object obj)
	{
		A ref = (A)obj;
		//Integer ref = (Integer)obj;
		//Boolean ref = (Boolean)obj;
		//A ref = (A)obj;
		//Double ref = (Double)obj;
		//Character ref = (Character)obj;
		System.out.println("this.i: " + this.i);
		System.out.println("ref.i: " + ref.i);
		System.out.println("-------------");
		//System.out.println("ref.i: " + ref);//Z = ASCII - 90 
		boolean flag = (this.i == ref.i);
		return flag;
	}
}

class M14
{
	public static void main(String[] args)
	{
		F f1 = new F(90);
		F f2 = new F(90);

		A a1 = new A();
		a1.i = 90;
		//System.out.println(a1.i);

		//System.out.println(f1.equals(f2));

		System.out.println(f1.equals(a1));
		//System.out.println(f1.equals(90.1));
		//System.out.println(f1.equals('Z'));
		
		//System.out.println(f1.equals("abc"));
		//System.out.println(f1.equals(a1));
		//System.out.println(f1.equals(true));

		System.out.println(a1.equals(f1));

	}
}