class G implements Cloneable
{
	int i;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		G obj1 = new G();
		obj1.i = 10;
		G obj2 = (G) obj1.clone();//downcasting return value of clone method to D type 
		System.out.println("a: " + obj2.i);
		obj2.i = 20;
		System.out.println("b: " + obj1.i);
		obj1.i = 30;
		System.out.println("c: " + obj2.i);
		System.out.println("d: " + obj1.i);
	}
}
/*
while cloning data of the original object copied into cloned object. After that
the changes are independent. I,e if we do change in the original
that will not be reflecting to duplicate and, if we do change in
the duplicate that is also not reflecting to the original object. Both
are independent objects. after cloning operation, both are
independent objects. throgh cloning we got the duplicate,
duplicate is a independent of original, changes in the original 
not reflecting back to duplicate, changes in the duplicate not
reflecting back to original. this type of cloning operation we call it as a
deep copy operation, why because no link between original and
duplicate. changes in the original not reflecting back to
duplicate, changes in the duplicate not reflecting back to
original. That is why it is called deep copy operation. object
class clone method providing a deep copy operation. changes in
the original not reflecting back to duplicate, changes in the
duplicate not reflecting back to original.
The opposite to deep copy operation is shallow copy operation
*/
