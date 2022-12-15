import java.util.ArrayList;

public class Manager16 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(60);
		list.add(40);
		list.add(20);
		System.out.println(list.contains(60));// it use to check if given element are available in index or not
		System.out.println(list.contains(80));
	}
}
