import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;

class Shared
{
	synchronized void test1(Shared obj)
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test1 begin by " + t1.getName());
		Util.sleep(1000);
		obj.test2(this);
		System.out.println("test1 end by " + t1.getName());
		
	}
	synchronized void test2(Shared obj)
	{
		Thread t1 = Thread.currentThread();
		System.out.println("test2 begin by " + t1.getName());
		Util.sleep(1000);
		obj.test1(this);
		System.out.println("test2 end by " + t1.getName());
	}
}
class Util
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
class Thread1 extends Thread
{
	Shared s1, s2;
	Thread1(Shared s1, Shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	
	@Override
	public void run() {
		s1.test1(s2);
	}
}
class Thread2 extends Thread
{
	Shared s1, s2;
	Thread2(Shared s1, Shared s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	
	@Override
	public void run() {
		s2.test2(s1);
	}
}
public class M2 {

	public static void main(String[] args) {
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		
		Thread1 t1 = new Thread1(s1, s2);
		t1.start();
		
		Util.sleep(100);
		
		Thread2 t2 = new Thread2(s1, s2);
		t2.start();
		
		
		Util.sleep(2000);
		
		ThreadMXBean tmx = ManagementFactory.getThreadMXBean();
		long[] ids = tmx.findDeadlockedThreads();
		
		if(ids != null)
		{
			System.out.println("Threads are under dead lock");
			System.out.println("dead locked thread ids: " + Arrays.toString(ids));
		}
		else
		{
			System.out.println("no threads are under dead lock");
		}
	}
}
/*
 * demonstration of dead lock
 * always avoid calling of synchronized method from another synchronized method.
   by using different reference variable.
 */
