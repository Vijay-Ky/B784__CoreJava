import java.util.ArrayList;

public class M1
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add('a');
		list.add(true);
		list.add(48);
		System.out.println(list);
	}
}
/*
 * .in every Class tostring method of object class got overrided.
. because of this we get the content instead of class name and hashcode.
.in arraylist class tostring method from object class got overrided.
*/


