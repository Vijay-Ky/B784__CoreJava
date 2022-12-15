import java.lang.reflect.Method;
class K
{
	void test2(String s1)
	{
		System.out.println("from test2:" + s1);
	}
}
class M10 
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("K");
		Object obj = c1.newInstance();	
		
		Method m2 = c1.getDeclaredMethod("test2", String.class);
		m2.invoke(obj, "hello");

		System.out.println();
	}
}
/*
1. How to call test2 method?
2. test2 method is taking one string argument.
   While defining a method object, supply name of the method and supply
   argument datatype. While calling a method on obj supply the argument.
3. while getting m1 we are simply suppying test1, without any datatypes.
   While getting m2, supplying test2 and string Datatype, and we called by supplying 
   m1.invoke(obj, "hello");
*/