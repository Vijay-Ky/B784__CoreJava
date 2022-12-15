class G
{
	static 
	{
		System.out.println("SIB");
	}
}
class M6
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		//G a1 = new G();
		Class c1 = Class.forName("G");
		
		System.out.println("done");
	}
}
/*
1. we LNO.13 - we are supplying class name in the form of a string. we are loading the class
   explicitely vis Class.forName.
2. if class is not loaded yet, we can load it by using Class.forName by specifying the class name
   in the form of a string.
*/