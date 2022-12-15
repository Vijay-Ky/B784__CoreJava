//pure queue
import java.util.PriorityQueue;

public class M12
{
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(90);
		queue.add(990);
		//ClassCastException
		//wherever sorting is happening we need to provide same type of elements.
		//if multiple types of elements are there we get ClassCastException.
		//there is a default sorting here. 
		queue.add(90.0);
		queue.add(190);
		queue.add(20);
		System.out.println(queue);
	}
}