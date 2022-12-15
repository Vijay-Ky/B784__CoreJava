import java.lang.reflect.Field;
import java.lang.reflect.Method;
class J
{
	int i;
	void test1()
	{
		System.out.println("from test");
	}
}
class M9
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("J");
		Object obj = c1.newInstance();
		Field f1 = c1.getDeclaredField("i");
		f1.setInt(obj, 20);
		Method m1 = c1.getDeclaredMethod("test1");
		m1.invoke(obj);
		System.out.println(f1.getInt(obj));
	}
}
/*

1. Class c1 = c1.forName("J"); - using class name in the form of string.
2. assume that we are reading this class name from the file system. and using this class
    through Class.forName. if the class is available run time environment load this class
	into the memory. 
3. whenever this class is loading to the memory object is created, then that object will be
   assigned to c1.
4. while using c1.newInstance, object is created to J class, this is another way of creating an
   object to that class(J).
5. c1 pointing to Class object whichever created to J class.
   while J loading to the memory one Class object is creating to J class,
   same is assigning to c1. Now c1 is a Class object to class J.
   Now If you call newinstance method you will get object to J,
   that object is assigned to obj. Obj pointing to J object.
   We are not using new operator and we are not using clone method.
   This is the third apporoach to create an object to any specified class.
   1 st – by using new operator straight away.
   2 nd – by using clone method.
   3 rd – by using reflection api newInstance method.
6. LNO: 17 we are finding out field object inside J class for the i.
   Inside a J class every information is there in the c1.
   c1 is a Class object to J. Through c1 we can call
   declared field. Supply name of the field in the form of string.
7. we got the field object which is refering to i, inside a J class.
8. f1.setInt(obj, 20); we need to set i value 20 in the obj pointing object.
   obj pointing object is a J object. f1 refering i. obj refering to J object.
   we wanted to set int value to i which is available in the obj.
9. f1.setInt(obj, 20); is similar to obj.i = 20 | in general we will be using
   reference[.]variable = 20 here, obj pointing to J object. f1 pointing to attribute i.
10. f1.setInt(obj, 20); 20 assigning to i. whatever i available in the obj that i modified to 20.
11. Method m1 = c1.getDeclaredMethod("test1"); in the J class there is a test1 method.
    by using c1 we can refere a test1 method.
12. m1.invoke(obj); on obj test1 method will be calling. obj pointing to J object.
    that J object containing i and test1, m1 refering to the test1()
13. System.out.println(f1.getInt(obj)); it is similar to System.out.println(obj.i);
    f1 refering to i
14. So the Output we get is from test
							20
15. we are using class name, attribute name, method name in the form of a string.
*/
