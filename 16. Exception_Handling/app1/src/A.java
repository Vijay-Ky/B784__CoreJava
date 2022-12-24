class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10 / 0;
		System.out.println("main end");
	}
}
/*
-exception is abnormal condition, in java an exception is an event that
disrupts the normal flow of program exection. it is an object that thrown at runtime

-adv. of Exception handling
 to maintain the normal flow of the application.
1.for abnormal condition corresponding exception object will be raised.
2.rised exception object should be handled to succesfully continue.

- two types of exception
1.checked exception(Exception)
2.unchecked exception(RuntimeException and Error is considered as unchecked exception)

1. (checked) exception that are checked at compile-time
2. (unchecked) exception that are checked at run-time


*/

