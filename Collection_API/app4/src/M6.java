import java.util.HashSet;

public class M6 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		//in case of StringBuffer hashcode and equals method not overrided.
		System.out.println(set.add(new StringBuffer("abc")));
		System.out.println(set.add(new StringBuffer("abc")));
		System.out.println(set.add(new StringBuffer("abc")));
		System.out.println(set.add(new StringBuffer("xyz")));
		System.out.println(set.add(new StringBuffer("xyz")));
		System.out.println(set.add(new StringBuffer("vijay")));
		System.out.println(set.add(new StringBuffer("vijay")));
	
		System.out.println(set);
	}
}
