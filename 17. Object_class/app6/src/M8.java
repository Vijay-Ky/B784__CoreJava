import java.lang.reflect.Field;
import java.lang.reflect.Method;

class A
{
	int i;
	void test1()
	{
		System.out.println("from test");
	}
}

class M8 
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("A");
		Object obj = c1.newInstance();
		Field f1 = c1.getDeclaredField("i");
		f1.setInt(obj, 20);//obj.i = 20;
		Method m1 = c1.getDeclaredMethod("test1");
		m1.invoke(obj);//obj.test1();
		System.out.println(f1.getInt(obj));//obj.i
		System.out.println(obj);
	}
}
