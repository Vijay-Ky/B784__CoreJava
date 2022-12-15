import java.util.ArrayList;

import java.util.Collections;

class E implements Comparable {
	int i, j;

	E(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public String toString() {
		return "(" + i + "," + j + ")";

	}

	public int compareTo(Object obj) {
		return i - ((E) obj).i;

	}
}

public class Manager25 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new E(9, 5));
		list.add(new E(3, 9));
		list.add(new E(0, 8));
		list.add(new E(1, 0));
		list.add(new E(8, 1));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
