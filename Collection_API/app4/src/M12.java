import java.util.LinkedHashSet;
class M12 
{
	public static void main(String[] args) 
	{
		//in case of LinkedList order is preserved
		LinkedHashSet set = new LinkedHashSet();
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
		//avoiding duplicates and maintaining order of addition.
		System.out.println(set);
	}
}
