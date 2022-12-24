class A 
{
	String name;
	int rollno;
	double salary;

	A(String inname, int inrollno, double insalary)//initialize
	{
		this.name = inname;
		this.rollno = inrollno;
		this.salary = insalary;
	}

	//overriding
	public String toString()
	{
		//returns className@hashcode in the form of hexadecimal (default)
		return rollno + " " + name + " " + salary; 
	}
}
class M1
{
	public static void main(String[] args)
	{
		A a1 = new A("vijay", 101, 20008.6);
		A a2 = new A("sara", 102, 45200.4);


		System.out.println(a1);
		System.out.println(a2);
	}
}