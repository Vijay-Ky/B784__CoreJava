import java.util.Scanner;
class E
{
	public static void main(String[] args) 
	{
		System.out.println("enter two boolean values value");

		Scanner sc = new Scanner(System.in);
		
		//TRUE or true and FALSE or false(case doesnt matter)
		//mixed case also possible
		boolean b1 = sc.nextBoolean();
		boolean b2 = sc.nextBoolean();
		
		System.out.println(b1);
		System.out.println(b2);

		//close the resource
		//good practice to close the opened resource after using it.
		sc.close();
	}
}
