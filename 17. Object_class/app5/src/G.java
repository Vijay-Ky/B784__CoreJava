class G implements Cloneable
{
	int i;

	public static void main(String[] args) throws Exception
	{
		G obj1 = new G();
		obj1.i = 10;
		G obj2 = (G)obj1.clone();

		System.out.println("a: " + obj1.i);
		System.out.println("b: " + obj2.i);

		obj2.i = 20;

		System.out.println("c: " + obj1.i);
		System.out.println("d: " + obj2.i);

		obj1.i = 30;

		System.out.println("e: " + obj1.i);
		System.out.println("f: " + obj2.i);
	}
}
