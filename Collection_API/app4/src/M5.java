import java.util.HashSet;

public class M5 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		//add method returns boolean value if success returns true.	
		//in string class also hashcode and equals method got overrided
		//order will be random not the inserted order.
		System.out.println(set.add("abc"));
		System.out.println(set.add("abc"));
		System.out.println(set.add("xyz"));
		System.out.println(set.add("xyz"));
		System.out.println(set.add("vijay"));
	
		System.out.println(set);
	}
}
