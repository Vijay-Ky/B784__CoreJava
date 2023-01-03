import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.CLASS)
@interface U
{
	String message();
}

//3 retention policy 1. SOURCE 2. CLASS 3. RUNTIME