import java.sql.DriverManager;
import java.sql.SQLException;
class M5
{
	public static void main(String[] args) 
	{
		//DriverManager.getConnection("");//checked type of exception requires try and catch
		try
		{
			DriverManager.getConnection("");
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
	}
}
