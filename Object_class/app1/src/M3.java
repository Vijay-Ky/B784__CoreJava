class E
{
	int i;

	public String toString()
	{
		return "" + i;
	}
}
class M3
{
	public static void main(String[] args)
	{
		E e1 = new E();
		e1.i = 10;
		E e2 = new E();
		e2.i = 20;
		System.out.println(e1);//address of the object instead of content
		System.out.println(e2);//hexadecimal repr of mem address
	}
}
/*
1.for all the java classes the most commonly required methods are defined in a separate class i,e object class.
2. if the class doesnt extends any other class then it is the direct child class of object class
if the class is already extends another class it is the indirect child class of object class.
3. object class contains totally 11 methods
*/
  