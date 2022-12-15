//inter thread communication

//class A is empty we are using A class only for wait and notifyAll purpose.
class A
{

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
		synchronized(obj)
		{
			System.out.println("wait on " + obj + " begin by " + Thread.currentThread().getName());
			try
			{
				obj.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("wait on " + obj + " end by " + Thread.currentThread().getName());
			
		}
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
		synchronized(obj)
		{
			System.out.println("wait on " + obj + " begin by " + Thread.currentThread().getName());
			try
			{
				obj.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("wait on " + obj + " end by " + Thread.currentThread().getName());
			
		}
	}
}
public class M1 {

	public static void main(String[] args) throws InterruptedException{
		A obj1 = new A();
		//A obj2 = new A();
		
		//both thread are using obj1
		Thread t1 = new Thread1(obj1);
		t1.start();
		
		Thread t2 = new Thread2(obj1);
		t2.start();
		
		Thread.sleep(10000);
		
		System.out.println("main after 10 sec sleep");
		
		//whaterver we were achiving through test2 method we acheivin via main method
		synchronized(obj1)
		{
			System.out.println("test2 on " + obj1 + " begin by " + Thread.currentThread().getName());
			//main thread calling notifyAll() on the obj1
			obj1.notifyAll();
			System.out.println("test2 on " + obj1 + " end by " + Thread.currentThread().getName());
		}
	}
}
/*
 
 */
