//static methods in synchronization
class A
{
	
	//as it is static method required class lock
	//every class will be having only one class lock
	static void test1()
	//synchronized static void test1()
	{
		Thread t1 = Thread.currentThread();
		System.out.println("from test1 non-synchronized statement: " + " by " + t1.getName());
		synchronized(A.class) {
		for(int i = 1; i <= 100; i++)
		{
			System.out.println("from test1: " + i + " by " + t1.getName());
		}
	 }
	}
	static void test2()
	//synchronized static void test2()
	{
		Thread t1 = Thread.currentThread();
		synchronized(A.class) {
		for(int i = 1; i <= 100; i++)
		{
			System.out.println("from test2: " + i + " by " + t1.getName());
		}
	  }
	}
}
class Thread1 extends Thread
{
	@Override
	public void run() {
		A.test1();
		//A.test2();
	}
}
class Thread2 extends Thread
{
	@Override
	public void run() {
		A.test1();
	}
}
public class M1 {

	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();
	}
}