enum V
{
	C1, C2, C3;
	V()
	{
		System.out.println("V()");
	}
}
class W
{
	public static void main(String[] args)
	{
		V v1 = V.C3;
		System.out.println(v1);
	}
}
/*
 1. if you dont provide the constructor compiler only providing
    the constructor. its similar to class
 2. when enum loading to the memory
 3. while using the enum, enum has to load to the memory.
    all 3 constants has to load to the memory.
 4. for every constant constructor will execute.
 5. in case of class when an object is creating constructor
    executes. in case of enum while loading a constant
    constructor will execute.
 6. every enum should have one constructor, if there is no
    constructor then compiler only keeps no-arg constructor.
 7. all enum constants are static, when class is loading 
    at that time all static members loading.
 8. for every enum constant constructor will execute. 
 */
