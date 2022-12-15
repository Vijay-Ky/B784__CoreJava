import java.lang.reflect.Method;
class L
{
	void test3(String s1)
	{
		System.out.println("from test3:" + s1);
	}
	void test3(String s1, int i, double j)
	{
		System.out.println("from test3:" + s1 + "," + i + "," + j);
	}
}
class M11
{
	public static void main(String[] args) throws Exception
	{	
		Class c1 = Class.forName("L");
		Object obj = c1.newInstance();	
		
		Method m1 = c1.getDeclaredMethod("test3", String.class);
		Method m2 = c1.getDeclaredMethod("test3", String.class, int.class, double.class);
		m1.invoke(obj, "hello");
		m2.invoke(obj, "hello", 30, 4.5);
	}
}
/*
1. developing one more method which accepts multiple arguments
2. in the same L class we develop multiple test3 methods, that is by overloading,
   by changing number of arguments or datatype. 
*/