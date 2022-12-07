//why multiple inheritace in not allowed in java
class Animal 
{
	public void name()
	{
		System.out.println("baby");
	}
}
class Human
{
	public void name()
	{
		System.out.println("ramu");
	}
}
class Creature extends Animal, Human
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();
		d1.name();
	}
}