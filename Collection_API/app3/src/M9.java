//pure queue
import java.util.PriorityQueue;

public class M9
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(990);
		queue.add(190);
		queue.add(20);
		queue.add(290);
		queue.add(790);
		queue.add(10);
		queue.add(15);
		System.out.println(queue);
		//becase of head element is sorted one the name is priority queue
		//removing the first element
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		//second element is not guranteed to sort, even we get sorted element.
		System.out.println(queue);
	}
}