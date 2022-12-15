class H
{
	static 
	{
		System.out.println("SIB");
	}
}
class M7
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		H a1 = new H();
		Class c1 = Class.forName("H");
		
		System.out.println("done");
	}
}
/*
1. if the class is already loaded it wont load one more time. any class will be loading to the 
   memory only one time
*/