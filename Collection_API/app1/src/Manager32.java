import java.util.ArrayList;
import java.util.Iterator;


	public class Manager32 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			it.remove();
			System.out.println(list);
			
		}
			System.out.println(list);
		
		}
		
}
