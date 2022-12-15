import java.sql.DriverManager;
import java.sql.SQLException;
class M10
{
	public static void main(String[] args)
	{
		test1();
		System.out.println("done");
	}
	static void test1()
	{
		try
		{
			test2();
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
	static void test2() throws ClassNotFoundException, SQLException, InterruptedException
	{
		Class.forName(""); 
		DriverManager.getConnection("");
		Thread.sleep(20000);
	}
}
/* a method can throw multiple exceptions by using , as a seperator*/
