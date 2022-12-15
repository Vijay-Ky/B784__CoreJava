//finalize method
class A
{
	protected void finalize() throws Throwable
	{
		System.out.println("from finalize");
	}
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1 = null;
		System.out.println("end of the program");
	}
}
/*
-finalize() method also is an object class method.
-if an object contains minimum one reference then that object is live object.
-one object can have any no. of references.
-if no reference are there for an object then that object becomes abandoned object.
-resurrected(restore (a dead person) to life.) - 
-resurrected object - if the dead or abandoned object gets a reference some how that type of 
object we call it as resurrected object.
-once the object becomes abandoned then it is eligible for garbage collection.
abandoned objects we can also call as garbage objects.
- once object becomes garbage object, in java there is one thread called
garbage collector it is a internal demon thread once in a while
going to the heap to check any abandoned objects are there if
there call finalize method on abandoned object, check whether if
it is still abandoned or not, if still abandoned then remove from
the memory.
- demon thread is a thread which is depending on
parent thread life. memory management is taken care by garbage
collector.
- when gc removing objects from the memory that is
uncertain. We cant tell at which moment object will removed by
the garbage collector, garbage collector coming to the memory
once in a while
-in the above program even though the object
becomes abandoned when we execute the program finalize method
wont be executed even though we have overrided in our class, why
because the total execution is getting over by the time of
garbage collector coming to the heap memory.
*/
