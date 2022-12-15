import java.io.FileReader;
import java.io.IOException;
class M4
{
	public static void main(String[] args) 
	{
		//FileReader f1 = new FileReader("");//checked type of exception requires try and catch
		try
		{
			FileReader f2 = new FileReader("");
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
