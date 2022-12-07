//is-a
class Animal 
{
	public void cell()
	{
		System.out.println("cell()");
	}
}
class Dog extends Animal
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();
		d1.cell();
	}
}
class Cat extends Animal
{
	public static void main(String[] args) 
	{
		Cat d1 = new Cat();
		d1.cell();
	}
}