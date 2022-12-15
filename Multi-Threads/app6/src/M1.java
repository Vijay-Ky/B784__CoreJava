//inter thread communication
class A
{
	synchronized void test1()
	{
		System.out.println("test1 on " + this + " begin by " + Thread.currentThread().getName());
		try
		{
			//while the current thread is going to waiting state the lock will be 
			//release because it doesnt know how much time it is going wait.
			wait();
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("test1 on " + this + " end by " + Thread.currentThread().getName());
	}
	synchronized void test2()
	{
		System.out.println("test2 on " + this + " begin by " + Thread.currentThread().getName());
		//notify doest required interrupted exception.
		//in case of notify it doesnt release lock until it executes the method
		//in case of notify only one thread will be notified randomly.
		//in case of notify only one thread notified and will be finishing execution others keep on waiting
		//notify();
		//in case of notifyAll() all the waiting threads will be notified and finishing the execution.
		notifyAll();
		System.out.println("test2 on " + this + " end by " + Thread.currentThread().getName());
	}
}
class Thread1 extends Thread
{
	A obj;
	Thread1(A obj)
	{
		this.obj = obj;
	}
	@Override
	public void run() {
		obj.test1();
	}
}
class Thread2 extends Thread
{
	A obj;
	Thread2(A obj)
	{
		this.obj = obj;
	}
	@Override
	public void run() {
		obj.test1();
	}
}
public class M1 {

	public static void main(String[] args) throws InterruptedException{
		A obj1 = new A();
		A obj2 = new A();
		
		Thread t1 = new Thread1(obj1);
		t1.start();
		
		Thread t2 = new Thread2(obj1);
		t2.start();
		
		Thread.sleep(5000);
		
		System.out.println("main after 5 sec sleep");
		
		obj1.test2();
		
		
		//test2 is for notifying all the threads.
		//child threads are going to the waiting state by using obj1
		//main thread calling test2 on obj2
		//no thread went into waiting by using obj2 object
		//thats why no threads will be receiving the notification hence keeps on waiting
		//obj2.test2();
	}
}
/*
 * Object
 * --------
 * wait()
 * notify()
 * notifyAll()
 * all these methods are non-synchronized, non-static methods 
   are available in every class. even in Thread class also.	
 * all these should be used on same object
 * all these should be called from the synchronized block.
 * inter thread communication is object wise.
 * object should be having lock in order to call these methods.
 */
