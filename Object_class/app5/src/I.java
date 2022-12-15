class H
{
	int x;
}
class I implements Cloneable
{
	H h1;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		I obj1 = new I();
		obj1.h1 = new H();
		System.out.println(obj1.h1.x);
		obj1.h1.x = 10;

		I obj2 = (I) obj1.clone();
		
		System.out.println(1 + ":" + obj2.h1.x);//10
		obj1.h1.x = 20;
		System.out.println(2 + ":" + obj2.h1.x);//20
		obj2.h1.x = 30;
		System.out.println(3 + ":" + obj1.h1.x);//30
	}
}
/*
shallow copy
operation, if any derived attributes are there.this program
performing shallow copy, if there is any derived attributes are
there we will be getting shallow copy thruogh object class clone
method. I class having only one attribute that is H type. if 
class containing derived datatype, then you will be getting a
shallow copy operation. object class clone method providing
shallow copy. Shallow copy means changes in one reflecting to
another. if attributes are primitive deep copy. If attributes
are derived then shallow copy.
*/
