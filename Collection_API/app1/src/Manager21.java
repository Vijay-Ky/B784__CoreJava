import java.util.ArrayList;

class A {
	int i;

	A(int i) {
		this.i = i;
	}
	public String toString()
	{
		return "" + i;
	}
}

public class Manager21 {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(90);
		list.add(new A(100));
		list.add(new A(200));
		System.out.println(list);
	}
}
/*
 * Arraylist class tostring method internally calling tostring method on every element.
 * */
