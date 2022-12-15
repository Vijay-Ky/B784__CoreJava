import java.util.HashSet;
import java.util.TreeSet;
class M13 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(90);
		set.add(92);
		set.add(93);
		set.add(90);
		set.add(900);
		set.add(800);
		set.add(800);
		set.add(80);
		set.add(660);
		set.add(76);
		set.add(98);
		System.out.println(set);
		
		//in order to sort the set
		//under Set stream if you want to sort go for TreeSet
		TreeSet tset = new TreeSet();
		tset.addAll(set);
		System.out.println(tset);
	}
}
