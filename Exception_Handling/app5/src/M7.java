import java.text.ParseException;
import java.text.SimpleDateFormat;

class M7
{
	public static void main(String[] args) 
	{
		SimpleDateFormat sd = null;
		//sd.parse("");//checked type of exception requires try and catch
		try
		{
			sd.parse("");
		}
		catch (ParseException ex)
		{
			ex.printStackTrace();
		}
	}
}
