//pure queue
import java.util.PriorityQueue;

public class M10
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(990);
		queue.add(190);
		queue.add(20);
		//there is no get method
		//bcz elements are not assigned with index or key.
		System.out.println(queue.get());
	}
}