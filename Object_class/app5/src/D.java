class D implements Cloneable
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		D d1 = new D();
		D d2 = (D) d1.clone();//downcasting return value of clone method to D type 
		System.out.println("d1: " + d1);
		System.out.println("d2: " + d2);
		System.out.println("done");
	}
}
/*
successful.
Clonable is an interface. Available in java.lang package, its a
marker interface. marker interface: an interface doesnt have any
members, an empty interface. It is only providing mark, providing
a type. D is a type of clonable, and all the clonable type are
allowing cloning operation. in order to specify something to the
runtime environment make the class as cloneable, so that allowing
the cloning operation. 
if object is type of cloneable then it is eligible for cloning operation.
*/