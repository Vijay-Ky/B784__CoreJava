//pure queue
import java.util.PriorityQueue;

public class M11
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(990);
		queue.add(190);
		queue.add(20);
		System.out.println(queue);
		
		//list,queue,set we can able to read elements through for-each
		//we cant predict the order
		//but head element is sorted one.
		for(Object obj : queue)
		{
			System.out.println(obj);
		}
	}
}