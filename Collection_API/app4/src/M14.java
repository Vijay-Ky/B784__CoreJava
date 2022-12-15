import java.util.HashSet;
import java.util.TreeSet;
class M14 
{
	public static void main(String[] args) 
	{
		//directly we can use TreeSet for sorted order
		TreeSet set = new TreeSet();
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
	}
}
