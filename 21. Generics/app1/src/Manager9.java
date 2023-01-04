class I <X>
{
	I i;
	X x1;
}
class Manager9 
{
	public static void main(String[] args) 
	{
		I obj1 = new I();
		I<String> obj2 = new I<String>();
		obj1.x1 = new Object();
		obj1.x1 = new Integer(10);
		obj1.x1 = new String("abc");
		obj1.x1 = 10;

		obj2.x1 = "xyz";
		//obj2.x1 = 20;
		
		obj1.i = new I();

		System.out.println(obj1.i.getClass().getName());
		System.out.println(obj1.x1.getClass().getName());
		System.out.println(obj2.x1);
	}
}
