//E is a sub class to Thread from Thread class several methods are inheriting.
//overriding run() method.
class E extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++)
		{
			//getName() is the method available in Thread class
			System.out.println(getName() + ":" + i);
		}
	}
}
public class M5 {

	public static void main(String[] args) {
		
		//we are creating two objects of E class i,e two threads E class
		//both the threads are allocated to execute the run method of class E
		//both the threads are using different copies of same run method.
		E e1 = new E();
		e1.start();
		//main thread receives unhandled exception object
		//main thread only terminating abnormally, not the child threads.
		//if main thread is terminated remaining portions of the main thread will not be executed.
		e1.start();//Exception(ITSE(IllegalThreadStateException)) one thread can be started only one time, one thread cant be started second time.
		
		E e2 = new E();
		e2.start();
		
		for(int i = 501; i <= 600; i++)
		{
			//in M5 there is no getName method
			//we need to get one thread reference to the current thread
			//in order to get the reference to current thread go for Thread.currentThread()
			//if this statement executed by main thread then main thread reference will be returning
			//through that reference call getName() method
			//this can be done on any thread
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}

	}

}
