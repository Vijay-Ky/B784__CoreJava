import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class F {
	int i, j;

	F(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public String toString() {
		return "(" + i + "," + j + ")";
	}
}

class SortBasedOnIValue implements Comparator {
	public int compare(Object o1, Object o2) {
		F f1 = (F) o1;
		F f2 = (F) o2;
		return f1.i - f2.i;
	}
}

class SortBasedOnJValue implements Comparator {
	public int compare(Object o1, Object o2) {
		F f1 = (F) o1;
		F f2 = (F) o2;
		return f1.j - f2.j;

	}
}

class Manager26 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new F(0, 1));
		list.add(new F(6, 2));
		list.add(new F(0, 8));
		list.add(new F(2, 5));
		list.add(new F(5, 1));
		System.out.println(list);
		Collections.sort(list, new SortBasedOnIValue());
		System.out.println("SortBasedOnIValue " + list);
		Collections.sort(list, new SortBasedOnJValue());
		System.out.println("SortBasedOnJValue: " + list);
	}
}
/*
-comparator interface has only one method compare and accepts two arguments.
*/
