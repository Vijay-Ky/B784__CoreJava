import java.sql.DriverManager;
import java.sql.SQLException;
class M12
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException
	{
		test1();
		System.out.println("done");
	}
	static void test1() throws ClassNotFoundException, SQLException, InterruptedException
	{
		test2();
	}
	static void test2() throws ClassNotFoundException, SQLException, InterruptedException
	{
		Class.forName(""); 
		DriverManager.getConnection("");
		Thread.sleep(20000);
	}
}
