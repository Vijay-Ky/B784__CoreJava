//inter thread communication

//without using a seperate class 
class Thread1 extends Thread
{
	@Override
	public void run() {
		synchronized(this)
		{
			System.out.println("wait on " + this + " begin by " + Thread.currentThread().getName());
			try
			{
				this.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("wait on " + this + " end by " + Thread.currentThread().getName());
			
		}
	}
}
class Thread2 extends Thread
{
	@Override
	public void run() {
		synchronized(this)
		{
			System.out.println("wait on " + this + " begin by " + Thread.currentThread().getName());
			try
			{
				this.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("wait on " + this + " end by " + Thread.currentThread().getName());
			
		}
	}
}
public class M1 {

	public static void main(String[] args) throws InterruptedException{
		
		Thread t1 = new Thread1();
		t1.start();
		
		Thread t2 = new Thread2();
		t2.start();
		
		Thread.sleep(10000);
		
		System.out.println("main after 10 sec sleep");
		
		//t1 thread going to the waiting state by using t1 iteself
		synchronized(t1)
		{
			System.out.println("test2 on " + t1 + " begin by " + Thread.currentThread().getName());
			//only single thread so just notify
			t1.notify();
			System.out.println("test2 on " + t1 + " end by " + Thread.currentThread().getName());
		}
		
		//t2 thread going to the waiting state by using t2 iteself
		synchronized(t2)
		{
			System.out.println("test2 on " + t2 + " begin by " + Thread.currentThread().getName());
			//only single thread so just notify
			t2.notify();
			System.out.println("test2 on " + t2 + " end by " + Thread.currentThread().getName());
		}
	}
}
/*
  it not compulsary that only main thread should send the notification.
  any thread can send the notification.
 */
