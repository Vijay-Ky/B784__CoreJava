import java.lang.reflect.Field;
class A
{
	int param1;
	String firstName;
}
class M2 
{
	public static void main(String[] args) 
	{
		A obj = new A();
		Class c1 = obj.getClass();

		System.out.println(c1.getName());

		Field[] fields = c1.getDeclaredFields();

		for(Field field : fields)
		{
			System.out.println(field.getName());
			System.out.println(field.getType());
			System.out.println("-----------");
		}
	}
}
