enum En
{
	C1, C2, C3, C4;
}
class F
{
	public static void main(String[] args)
	{
		System.out.println(En.C1);
		System.out.println(En.C3);	
	}
}
//inside enum we can declare any number of constants
//all constant should be separated by "," 
//identifier names should be unique
//in java constant means static and final
//static means only one time loading
//final means cant be changed.
//all enum constants are static by default
//enum constant can be accessed with an enum name.
