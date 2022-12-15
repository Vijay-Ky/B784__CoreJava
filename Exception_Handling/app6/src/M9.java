import java.sql.DriverManager;
import java.sql.SQLException;
class M9
{
	public static void main(String[] args)
	{
		test1();
		System.out.println("done");
	}
	static void test1()
	{
		test2(); 
	}
	static void test2()
	{
		try
		{
			Class.forName(""); 
			DriverManager.getConnection("");
			Thread.sleep(20000);
		}
		catch (Exception ex)
		{
		}
	}
}
/* simply we can keep Exception*/