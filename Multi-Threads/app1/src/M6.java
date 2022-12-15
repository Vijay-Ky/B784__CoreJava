class F implements Runnable
{
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
public class M6 {

	public static void main(String[] args) {
		F f1 = new F();
		Thread t1 = new Thread(f1);
		t1.start();
		
		//we can create multiple Thread object by using same F object
		Thread t2 = new Thread(f1);
		//both the threads are going to same run method of F 
		//but one is using one copy of run() method another is using another copy of run() method
		//we can create multiple threads by using same Runnable object.
		t2.start();
		
		for(int i = 501; i <= 600; i++)
		{
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
//for the first child thread the default name is starts with Thread:0
