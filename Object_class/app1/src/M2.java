import java.lang.reflect.*;
class M2
{
	public static void main(String[] args) throws Exception
	{
		int count = 0;
		Class c = Class.forName("java.lang.Object");
		Method[] m = c.getDeclaredMethods();
		for(Method m1 : m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("The number of methods:" + count);
	}
}
/*
1.public String toString()
2.public native int hashCode()
3.public boolean equals(Object o)
4.protected native Object clone() throws CloneNotSupportedException
5.protected void finalize() throws Throwable
6.public final Class getClass()
7.public final void wait() throws InterruptedException
8.public final native void wait(long ms) throws InterruptedException
9.public final native void wait(long ms, int ns) throws InterruptedException
10.public final native void notify()
11.public final native void notifyAll()
12.private static native void registerNatives() - this method used internally by the object class
and not available to the child classes hence we are considering this method
*/
