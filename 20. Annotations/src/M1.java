import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;

//@Retention(RetentionPolicy.RUNTIME)
@Retention(RetentionPolicy.CLASS)
@interface Y
{
	String message();
}

//@Retention(RetentionPolicy.RUNTIME)
@Retention(RetentionPolicy.CLASS)
@interface Z
{
	String message();
}

@Y(message = "abc")
@Z(message = "xyz")
class M1 
{
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("M1");
		Annotation[] annotations = c1.getAnnotations();

		for(Annotation annotation : annotations)
		{
			System.out.println(annotation);
		}
	}
}
