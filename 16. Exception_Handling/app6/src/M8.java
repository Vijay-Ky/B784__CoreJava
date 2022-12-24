import java.sql.DriverManager;
import java.sql.SQLException;
class M8
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
		catch (ClassNotFoundException ex)
		{
		}
		catch (SQLException ex)
		{
		}
		catch (InterruptedException ex)
		{
		}
	}
}
/*instead of throws excpetion we can go for try and individual catches*/