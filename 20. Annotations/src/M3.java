import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface Y
{
	String message();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Z
{
	String message();
}

@Y(message = "abc")
@Z(message = "xyz")
class M2
{
}

class M3 extends M2
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("M3");
		Annotation[] annotations = c1.getAnnotations();

		for(Annotation annotation : annotations)
		{
			System.out.println(annotation);
		}
	}
}
