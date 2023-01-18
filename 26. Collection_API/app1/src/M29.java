import java.util.PriorityQueue;
class M29
{
	public static void main(String[] args) 
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add(100);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
	}
}
