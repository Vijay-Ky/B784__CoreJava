public class M9 {

	public static void main(String[] args) {
		//executed by main thread
		Thread t1 = Thread.currentThread();
		//reading default properties of main thread
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
	}
}
/*
 * we can change the name of a thread
 * Daemon thread is thread which is purely depending on parent thread.
   when parent is leaving from the execution demon also leaving from the execution.
   even though daemon thread having some more execution.  
 *The opposite of Daemon thread is user thread even though parent thread is
  leaving from the execution, child finishing its execution.
 *by default in java we get all the threads as user threads only.
 * user thread is not Daemon thread. 
 *any thread can be converted user to daemon and daemon to user before calling
  the start method.
 *main thread cant be converted into daemon, bcz its already started by the JVM.
 *priority is an integer number from 1 to 10
  1 is min, 5 is normal, 10 is max priority. 
 * the default priority of the main thread is normal priority.
 * we just make a request to thread scheduler through priority
 * we cant say every time only high priority thread only executes.
   it depends on the thread scheduler. but most of the times it considers
   the request.
 * every thread will be having a unique id. particular thread can be referred
   through its id. two threads will not be having the same id.
   id is a long number and random.we just read the id but we cant modify.
 * */
