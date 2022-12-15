//basics
public class M1
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
	}
}









/*
 Multitasking
 ----------------------
Multitasking is a process of executing multiple tasks 
simultaneously. We use multitasking to utilize the CPU. 

Multitasking can be achieved in two ways:
-------------------------------------------

Process-based Multitasking (Multiprocessing)
Thread-based Multitasking (Multithreading)

1) Process-based Multitasking (Multiprocessing)
Each process has an address in memory. In other words,
each process allocates a separate memory area.
A process is heavyweight.
Cost of communication between the process is high.
Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc.

2) Thread-based Multitasking (Multithreading)
Threads share the same address space.
A thread is lightweight.
Cost of communication between the thread is low.

Note: At least one process is required for each thread.

 What is Multithreading in Java?
Multithreading in Java is a process of executing multiple threads 
simultaneously.

A thread is a lightweight sub-process, the smallest unit of 
processing. Multiprocessing and multithreading, both are used to 
achieve multitasking.

However, we use multithreading than multiprocessing because 
threads use a shared memory area. They don't allocate separate 
memory area so saves memory, and context-switching between the 
threads takes less time than process.

Advantages of Java Multithreading
1) It doesn't block the user because threads are independent 
and you can perform multiple operations at the same time.

2) You can perform many operations together, so it saves time.

3) Threads are independent, so it doesn't affect other threads
 if an exception occurs in a single thread.
 
 
What is Thread in java
A thread is a lightweight subprocess, the smallest unit 
of processing. It is a separate path of execution.

Threads are independent. If there occurs exception in one thread, it doesn't affect other threads. It uses a shared memory area.

Java Multithreading is mostly used in games, animation, etc.
 
 
 MULTITHREADING in Java is a process of executing two or more
 threads simultaneously to maximum utilization of CPU. 
 Multithreaded applications execute two or more threads run 
 concurrently. Hence, it is also known as Concurrency in Java.
 Each thread runs parallel to each other. Mulitple threads don't 
 allocate separate memory area, hence they save memory. Also, 
 context switching between threads takes less time.
 
 1.Multiple threads involving in the execution.
 2. By default core java program executing through a single thread.
 3. By default entire execution of core java will be done by the main thread.	
 
 */



