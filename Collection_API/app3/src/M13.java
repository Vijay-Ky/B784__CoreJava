//pure queue
import java.util.PriorityQueue;

public class M13
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(990);
		//NullPointerException
		//while sorting internally it is calling one method called compareto 
		//wherever sorting is there we should not go for null element.
		queue.add(null);
		queue.add(190);
		queue.add(20);
		System.out.println(queue);
	}
}
/* while sorting 3 conditions
1.no different elements
2.no null elements
3.elements should be comparable type or a seperate comparator should be supplied.
*/