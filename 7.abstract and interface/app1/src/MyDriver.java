abstract class MyDriver
{
	void howToDrive()
	{
		System.out.println("I got a Licence, & know how to drive");
	}
	abstract void technicalThings();
}
class Car extends MyDriver
{
	void technicalThings()
	{
		System.out.println("Technincal things");
	}
	public static void main(String[] args) 
	{
		Car c1 = new Car();
		c1.howToDrive();
		c1.technicalThings();
	}
}
