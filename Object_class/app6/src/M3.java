import java.lang.reflect.Field;
class B
{
	int i;
	double j;
	boolean k;
	char l;
	byte m;
}
class D
{
	int param1;
	String firstName;
}
class M3
{
	public static void main(String[] args) 
	{
		Object obj = new B();
		test(obj);
	}
	static void test(Object obj)
	{
		Class c1 = obj.getClass();
		System.out.println(c1.getName());
		Field[] fields = c1.getDeclaredFields();
		for(Field field : fields)
		{
			System.out.println(field.getName());
			System.out.println(field.getType());
			System.out.println("----------------");
		}
	}
}
/*
1. somebody is calling test method, and we are the developer of test() method.
   for the test method and we are getting an object. and we dont know to which class object
   is created.
*/