//first approach of creating a thread
class A extends Thread
{
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++)
		{
			System.out.println("first thread: " + i);
		}
	}
}
class B extends Thread
{
	@Override
	public void run() {
		for(int i = 200; i <= 300; i++)
		{
			System.out.println("second thread: " + i);
		}
	}
}
public class M3 {

	public static void main(String[] args) {
		
		//while creating an object to A class for Thread is creating.
		//bcz A is a subclass to Thread now.
		//we can call class A is specialized to Thread.
		//while creating a thread it is getting all the default properties.
		A a1 = new A();// new thread got created and having all the properties but this not knowing to the thread scheduler
		//we cant use the thread straight away.
		//after creating a thread we have to call start method.
		//we should not call run method even though we have overrided run method.
		//start method will take care of giving a call to run method internally
		//start method also inherited method from the Thread class.
		//totally three threads are involved in the execution. 
		//main thread is parent
		//thread A is child
		//main thread only calling child thread
		//child thread goes to execute run method and main thread continues to execute the main method.
		//processor allocating to all three threads.
		//some milsec to each thread.
		//there is a concept of thread scheduler, it is taking care of scheduling processor time to all the registered threads.
		//thread scheduler assign available processor time for each thread randomly thats why we cant able to predict the o/p order.
		//generally execution is from top to bottom if execution is from top to bottom o/p also from top to bottom. 
		//some times we require o/p simultaneously, one from one block another from another block
		//customer might require output like that.
		//example of multi threads simultaneously audio and video playing.
		//assign one thread for one o/p another thread for another o/p
		// thread is a piece of code executing independent and parallel to another thread.
		//The Java Virtual Machine allows an application to have multiple threads of execution running concurrently.
		//to develop a thread in java there are two approaches 
		  //1. extending Thread class
		  //2. implementing Runnable interface.
		//main thread only creating child threads, registering with the thread scheduler and allocating to execute run method.
		a1.start();//while calling start method it is registering newly created thread with the thread scheduler.
		B b1 = new B();
		b1.start();
		//after this point main thread continues to execute remaining portion of the main thread.
		 // by the time two child threads also went into execute corresponding run methods.
		for(int i = 300; i <= 400; i++)
		{
			System.out.println("main thread: " + i);
		}
	}
}






//we cant able to predict the o/p
/*
1. Thread is a concrete class in java.lang package.
2. run method is a inherited method.
3. while overriding the run method we need to incorporate thread task.
*/