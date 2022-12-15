import java.util.Scanner;
class M3
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		if(age <= 0)
		{
			//Explicitely we are terminating the flow
			//we can also keep this statement inside the try-catch
			//bt dont provide the try-catch bcz its meanigless
			//we are only terminating the flow bcz something went wrong
			throw new ArithmeticException("age should be greater than 0");
		}
		System.out.println(2);
	}
}