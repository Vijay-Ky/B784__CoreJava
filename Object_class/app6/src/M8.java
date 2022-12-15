class I
{
	static 
	{
		System.out.println("SIB");
	}
}
class M8
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		I a1 = new I();
		Class obj1 = a1.getClass();
		Class obj2 = Class.forName("I");		
		//System.out.println(a1 == obj1);
		//System.out.println(a1 == obj2);
		//System.out.println(obj1 == obj2);
		//System.out.println(a1.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		//System.out.println("done");
	}
}
/*
1. whenever class is loading to the memory (I class) at that time Class object is created
   only one object is created.
2. That object reference returning to obj1 and same reference returning to obj2.
3. sometimes we require to manage a class through a string, class name is in one file.
   reading the class name into java program, that class name available inside a string,
   as a string object.
*/