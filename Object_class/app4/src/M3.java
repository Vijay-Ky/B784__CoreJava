class Util
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(millis);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
class C
{
	static C obj;
	protected void finalize() throws Throwable
	{
		obj = this;
		System.out.println("from finalize");
	}
}
class M3 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println(1 + ":" + c1);
		System.out.println(2 + ":" + C.obj);
		Util.sleep(1000);
		c1 = null;
		System.gc();
		Util.sleep(1000);
		System.out.println(3 + ":" + c1);
		System.out.println(4 + ":" + C.obj);
		C.obj = null;
		Util.sleep(1000);
		System.gc();
		System.out.println(5 + ":" + c1);
		System.out.println(6 + ":" + C.obj);
		System.out.println("end");
	}
}
/*
class C containing one static type
attribute, you can access this by using class name.  c1
pointing to an object. obj is null. one second sleep.
making first object that is a1 pointing object abandoned.
.making a request to garbage collector.main thread
is sleeping for one second.somehow abandoned object
assigning to obj.current object assigning to obj. gc
suppose to remove one abandoned object, at last step finalize
method is executing.inside a finalize method ‘this’ i,e
current object, which object is about to be garbage collected,
that object assigned to obj, obj is a reference variable. While
executing a finalize method object is getting life. we
made a request to garbage collector, garbage collector called
finalize method. while calling the finalize method somehow object
got the reference. Now this object becomes as a resurructed
object.c1 will be null. wherever c1 was pointing
for the same object obj pointing now. from the resurructed
object we removed reference variable, so now resurructed object
become abandoned.sleeping for one second.calling 
gc.if resurructed object becoming abandoned, then straight away
removing that object without calling finalize method.on any
object finalize method calling only one time.if at all
resurructed object becoming abandoned then removing that object
straight away without calling finalize method
*/