import java.util.HashSet;

public class M7 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		//in case of StringBuilder hashcode and equals method not overrided.
		System.out.println(set.add(new StringBuilder("abc")));
		System.out.println(set.add(new StringBuilder("abc")));
		System.out.println(set.add(new StringBuilder("abc")));
		System.out.println(set.add(new StringBuilder("xyz")));
		System.out.println(set.add(new StringBuilder("xyz")));
		System.out.println(set.add(new StringBuilder("xyz")));
		System.out.println(set.add(new StringBuilder("vijay")));
		System.out.println(set.add(new StringBuilder("vijay")));
		System.out.println(set.add(new StringBuilder("vijay")));


	
		System.out.println(set);
	}
}
