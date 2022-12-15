import java.util.HashSet;

public class M3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		//these are objects of wrapper class not the objects of A class
		set.add(90);
		set.add(90);
		set.add(90);
		set.add(90);
		set.add(90);
		//in every wrapper class both hascode and equals method got overrided.
		  //that is why can able to identify duplicates.
		System.out.println(set);
	}
}
