class A
{
	private String name; 
	private int id;
	private int age;

	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public int getAge()
	{
		return age;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
}
class B
{
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println("Name: " + a1.getName() + " Id: " + a1.getId() +
			" Age: " + a1.getAge());
		a1.setName("vijay");
		a1.setId(101);
		a1.setAge(55);
		System.out.println("Name: " + a1.getName() + " Id: " + a1.getId() +
			" Age: " + a1.getAge());
	}
}